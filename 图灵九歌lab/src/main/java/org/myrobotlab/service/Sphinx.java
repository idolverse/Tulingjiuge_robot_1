/**
 *                    
 * @author grog (at) myrobotlab.org
 *  
 * This file is part of MyRobotLab (http://myrobotlab.org).
 *
 * MyRobotLab is free software: you can redistribute it and/or modify
 * it under the terms of the Apache License 2.0 as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version (subject to the "Classpath" exzception
 * as provided in the LICENSE.txt file that accompanied this code).
 *
 * MyRobotLab is distributed in the hope that it will be useful or fun,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Apache License 2.0 for more details.
 *
 * All libraries in thirdParty bundle are subject to their own license
 * requirements - please refer to http://myrobotlab.org/libraries for 
 * details.
 * 
 * Enjoy !
 * 
 * Dependencies:
 * sphinx4-1.0beta6
 * google recognition - a network connection is required
 * 
 * References:
 * Swapping Grammars - http://cmusphinx.sourceforge.net/wiki/sphinx4:swappinggrammars
 * 
 * http://cmusphinx.sourceforge.net/sphinx4/javadoc/edu/cmu/sphinx/jsgf/JSGFGrammar.html#loadJSGF(java.lang.String)
 * TODO - loadJSGF - The JSGF grammar specified by grammarName will be loaded from the base url (tossing out any previously loaded grammars)
 * 
 * 
 * */

package org.myrobotlab.service;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import org.apache.commons.lang.StringUtils;
import org.myrobotlab.framework.Message;
import org.myrobotlab.framework.Service;
import org.myrobotlab.io.FileIO;
import org.myrobotlab.logging.Level;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.logging.Logging;
import org.myrobotlab.logging.LoggingFactory;
import org.myrobotlab.service.abstracts.AbstractSpeechRecognizer;
import org.myrobotlab.service.config.SpeechRecognizerConfig;
import org.myrobotlab.service.data.Locale;
import org.myrobotlab.service.interfaces.SpeechSynthesis;
import org.myrobotlab.service.interfaces.TextListener;
import org.slf4j.Logger;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;

/**
 * 
 * Sphinx - Speech recognition based on CMU Sphinx. This service must be told
 * what it's listening for. It does not do free-form speech recognition.
 * 
 */
@Deprecated /* we need another offline solution - one that doesn't suck */
public class Sphinx extends AbstractSpeechRecognizer<SpeechRecognizerConfig> {

  class SpeechProcessor extends Thread {
    Sphinx myService = null;
    public boolean isRunning = false;

    public SpeechProcessor(Sphinx myService) {
      super(myService.getName() + "_ear");
      this.myService = myService;
    }

    @Override
    public void run() {

      try {
        isRunning = true;

        info(String.format("starting speech processor thread %s_ear", myService.getName()));

        String newPath = FileIO.getCfgDir() + File.separator + myService.getName() + ".xml";
        File localGramFile = new File(newPath);

        warn("CONFIG NOT IMPLEMENTED, ONLY SUPPORTS BASE EN-US");

        info("loading grammar file");
        if (localGramFile.exists()) {
          info(String.format("grammar config %s", newPath));
        } else {
          // resource in jar default
          info(String.format("grammar /resource/Sphinx/simple.xml"));
        }

        info("starting recognizer");
        // start the word recognizer
//        recognizer = cm.lookup("recognizer");
        Configuration configuration = new Configuration();

        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
        recognizer = new LiveSpeechRecognizer(configuration);
        recognizer.startRecognition(true);
        
        SpeechRecognizerConfig c = config;


        // loop the recognition until the program exits.
        c.listening = true;
        while (isRunning) {

          info("listening: %b", c.listening);
          invoke("listeningEvent", true);
          Result result = recognizer.getResult().getResult();

          if (!c.listening) {
            // we could have stopped listening
            Thread.sleep(250);
            continue;
          }

          log.info("Recognized Loop: {}  Listening: {}", result, c.listening);
          // log.error(result.getBestPronunciationResult());

          if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();
            if (StringUtils.isEmpty(resultText)) {
              // nothing heard?
              continue;
            }
            log.info("recognized: " + resultText + '\n');
            if (resultText.length() > 0 && c.listening) {
              if (lockPhrases.size() > 0 && !lockPhrases.contains(resultText) && !confirmations.containsKey(resultText)) {
                log.info("but locked on {}", resultText);
                continue;
              }

              // command system being used
              if (commands != null) {

                if (currentCommand != null && (confirmations == null || confirmations.containsKey(resultText))) {
                  // i have a command and a confirmation
                  // command sent
                  send(currentCommand);
                  // command finished
                  currentCommand = null;
                  invoke("publishText", "ok");
                  continue;

                } else if (currentCommand != null && negations.containsKey(resultText)) {
                  // negation has happened... recognized the
                  // wrong command
                  // reset command
                  currentCommand = null;
                  // apologee
                  invoke("publishText", "sorry");
                  continue;
                } else if (commands.containsKey(resultText) && (confirmations != null || negations != null)) {
                  if (bypass != null && bypass.containsKey(resultText)) {
                    // we have confirmation and/or negations
                    // - but we also have a bypass
                    send(currentCommand);
                  } else {
                    // setting new potential command - using
                    // either confirmations or negations
                    Message cmd = commands.get(resultText);
                    currentCommand = cmd;
                    invoke("publishRequestConfirmation", resultText);
                    // continue in the loop, we should stop listening, and we
                    // shouldn't publish the text becuase we just asked for
                    // confirmation.
                    continue;
                  }
                } else if (commands.containsKey(resultText)) {
                  // no confirmations or negations are being
                  // used - just send command
                  Message cmd = commands.get(resultText);
                  send(cmd);
                } else {
                  error(String.format("unknown use case for Sphinx commands - word is %s", resultText));
                  // we don't know what this command was.. just continue.. we
                  // shouldn't publish text or recognized.
                  // we recognized it. but we don't publish text..
                  invoke("recognized", resultText);
                  continue;
                }
              }

              // publishRecognized(resultText);
              // Only publish the text if there was a known command?
              invoke("publishText", resultText);
              invoke("recognized", resultText);
            }

          } else {
            sleep(250);
            // invoke("unrecognizedSpeech");
            log.error("I can't hear what you said.\n");
          }
        }
      } catch (Exception e) {
        error(e);
      }
    }

  }

  private static final long serialVersionUID = 1L;

  public final static Logger log = LoggerFactory.getLogger(Sphinx.class.getCanonicalName());
  transient Microphone microphone = null;
  transient ConfigurationManager cm = null;
  transient LiveSpeechRecognizer recognizer = null;

  transient SpeechProcessor speechProcessor = null;

  HashSet<String> lockPhrases = new HashSet<String>();

  HashMap<String, Message> confirmations = null;

  HashMap<String, Message> negations = null;

  HashMap<String, Message> bypass = null;

  Message currentCommand = null;

  public static void main(String[] args) {

    LoggingFactory.init(Level.DEBUG);
    try {
      Sphinx ear = (Sphinx) Runtime.start("ear", "Sphinx");
      SpeechSynthesis speech = (MarySpeech) Runtime.start("speech", "MarySpeech");
      ((MarySpeech) speech).startService();

      // attache speech to ear -
      // auto subscribes to "request confirmation"
      // so that speech asks for confirmation
      // TODO - put this in gui so state will be updated with text
      // question
      ear.addMouth(speech);

      Log log = (Log) Runtime.createAndStart("log", "Log");
      Clock clock = (Clock) Runtime.createAndStart("clock", "Clock");

      // TODO - got to do this - it will be KICKASS !
      // log.subscribe(outMethod, publisherName, inMethod, parameterType)
      // new MRLListener("pulse", log.getName(), "log");

      ear.addCommand("log", log.getName(), "log");
      ear.addCommand("log subscribe to clock", log.getName(), "subscribe", new Object[] { "pulse", });

      ear.addCommand("start clock", clock.getName(), "startClock");
      ear.addCommand("stop clock", clock.getName(), "stopClock");
      ear.addCommand("set clock interval to five seconds", clock.getName(), "setInterval", 5000);
      ear.addCommand("set clock interval to ten seconds", clock.getName(), "setInterval", 10000);

      ear.addComfirmations("yes", "correct", "right", "yeah", "ya");
      ear.addNegations("no", "incorrect", "wrong", "nope", "nah");

      ear.startListening();

      // ear.startListening("camera on | camera off | arm left | arm right |
      // hand left | hand right ");
      // ear.startListening("yes | no");

      // Sphinx ear = new Sphinx("ear");
      // ear.createGrammar("hello | up | down | yes | no");
      // ear.startService();
    } catch (Exception e) {
      Logging.logError(e);
    }

  }

  public Sphinx(String n, String id) {
    super(n, id);
  }

  public void addBypass(String... txt) {
    if (bypass == null) {
      bypass = new HashMap<String, Message>();
    }
    Message bypassCommand = Message.createMessage(getName(), getName(), "bypass", null);

    for (int i = 0; i < txt.length; ++i) {
      bypass.put(txt[i], bypassCommand);
    }
  }

  public void addComfirmations(String... txt) {
    if (confirmations == null) {
      confirmations = new HashMap<String, Message>();
    }
    Message confirmCommand = Message.createMessage(getName(), getName(), "confirmation", null);

    for (int i = 0; i < txt.length; ++i) {
      confirmations.put(txt[i], confirmCommand);
    }
  }

  public void addNegations(String... txt) {
    if (negations == null) {
      negations = new HashMap<String, Message>();
    }
    Message negationCommand = Message.createMessage(getName(), getName(), "negation", null);

    for (int i = 0; i < txt.length; ++i) {
      negations.put(txt[i], negationCommand);
    }

  }

  @Override
  public void addTextListener(TextListener service) {
    addListener("publishText", service.getName(), "onText");
  }

  public void addVoiceRecognitionListener(Service s) {
    // TODO - reflect on a public heard method - if doesn't exist error ?
    this.addListener("recognized", s.getName(), "heard");
  }

  // TODO - make "Speech" interface if desired
  // public boolean attach(SpeechSynthesis mouth) {
  // if (mouth == null) {
  // warn("can not attach mouth is null");
  // return false;
  // }
  // // if I'm speaking - I shouldn't be listening
  // mouth.addEar(this);
  // this.addListener("publishText", mouth.getName(), "onText");
  // this.addListener("publishRequestConfirmation", mouth.getName(),
  // "onRequestConfirmation");
  // log.info(String.format("attached Speech service %s to Sphinx service %s
  // with default message routes", mouth.getName(), getName()));
  // return true;
  // }

  public void buildGrammar(StringBuffer sb, HashMap<String, Message> cmds) {
    if (cmds != null) {
      if (sb.length() > 0) {
        sb.append("|");
      }
      int cnt = 0;
      for (String key : cmds.keySet()) {
        ++cnt;
        sb.append(key);
        if (cnt < cmds.size()) {
          sb.append("|");
        }
      }
    }
  }

  /*
   * public void publishRecognized(String recognizedText) { invoke("recognized",
   * recognizedText); }
   */

  @Override
  public void clearLock() {
    lockPhrases.clear();
  }

  /**
   * createGrammar must be called before the Service starts if a new grammar is
   * needed
   * 
   * example: Sphinx.createGrammar ("ear", "stop | go | left | right | back");
   * ear = Runtime.create("ear", "Sphinx")
   * 
   * param filename - name of the Service which will be utilizing this grammar
   * 
   * @param grammar
   *          - grammar content
   * @return true/false
   */
  public boolean createGrammar(String grammar) {
    log.info("creating grammar [{}]", grammar);
    // FIXME - probably broken
    // get base simple.xml file - and modify it to
    // point to the correct .gram file
    String simplexml = getResourceAsString("simple.xml");
    // String grammarLocation = "file://" + cfgDir.replaceAll("\\\\", "/") +
    // "/";
    // simplexml = simplexml.replaceAll("resource:/resource/",
    // cfgDir.replaceAll("\\\\", "/"));
    simplexml = simplexml.replaceAll("resource:/resource/", FileIO.getCfgDir());

    // a filename like i01.ear.gram (without the gram extention of course
    // because is sucks this out of the xml"
    // and re-processes it to be as fragile as possible :P
    String grammarFileName = getName();
    grammarFileName = grammarFileName.replaceAll("\\.", "_");
    if (grammarFileName.contains(".")) {
      grammarFileName = grammarFileName.substring(0, grammarFileName.indexOf("."));
    }

    simplexml = simplexml.replaceAll("name=\"grammarName\" value=\"simple\"", "name=\"grammarName\" value=\"" + grammarFileName + "\"");
    try {
      FileIO.toFile(String.format("%s%s%s.%s", FileIO.getCfgDir(), File.separator, grammarFileName, "xml"), simplexml);
      // save("xml", simplexml);

      String gramdef = "#JSGF V1.0;\n" + "grammar " + grammarFileName + ";\n" + "public <greet> = (" + grammar + ");";
      FileIO.toFile(String.format("%s%s%s.%s", FileIO.getCfgDir(), File.separator, grammarFileName, "gram"), gramdef);
    } catch (Exception e) {
      Logging.logError(e);
      return false;
    }
    // save("gram", gramdef);

    return true;
  }

  public boolean isRecording() {
    return microphone.isRecording();
  }

  /*
   * an inbound port for Speaking Services (TTS) - which suppress listening such
   * that a system will not listen when its talking, otherwise a feedback loop
   * can occur
   * 
   * 
   */
  public synchronized boolean onIsSpeaking(Boolean talking) {
    SpeechRecognizerConfig c = config;

    if (talking) {
      c.listening = false;
      log.info("I'm talking so I'm not listening"); // Gawd, ain't that
      // the truth !
    } else {
      c.listening = true;
      log.info("I'm not talking so I'm listening"); // mebbe
    }
    return talking;
  }

  /**
   * Event is sent when the listening Service is actually listening. There is
   * some delay when it initially loads.
   */
  @Override
  public void listeningEvent(Boolean event) {
    return;
  }

  /*
   * FIXME - the trunk is broke - the configuration is horrible find a way to
   * make this work, despite Sphinx's chaos !
   * 
   * function to swap grammars to allow sphinx a little more capability
   * regarding "new words"
   * 
   * check http://cmusphinx.sourceforge.net/wiki/sphinx4:swappinggrammars
   * 
   * @throws PropertyException
   */
  /*
   * FIXME SPHINX IS A MESS IT CAN"T DO THIS ALTHOUGH DOCUMENTATION SAYS IT CAN
   * void swapGrammar(String newGrammarName) throws PropertyException,
   * InstantiationException, IOException { log.debug("Swapping to grammar " +
   * newGrammarName); Linguist linguist = (Linguist) cm.lookup("flatLinguist");
   * linguist.deallocate(); // TODO - bundle sphinx4-1.0beta6 //
   * cm.setProperty("jsgfGrammar", "grammarName", newGrammarName);
   * 
   * linguist.allocate(); }
   */

  @Override
  public void lockOutAllGrammarExcept(String lockPhrase) {
    this.lockPhrases.add(lockPhrase);
  }

  /*
   * deprecated public void onCommand(String command, String targetName, String
   * targetMethod, Object... data) { Message msg = new Message(); msg.name =
   * targetName; msg.method = targetMethod; msg.data = data;
   * 
   * commandMap.put(command, msg); }
   */

  /**
   * method to suppress recognition listening events This is important when
   * Sphinx is listening --&gt; then Speaking, typically you don't want Sphinx
   * to listen to its own speech, it causes a feedback loop and with Sphinx not
   * really very accurate, it leads to weirdness -- additionally it does not
   * recreate the speech processor - so its not as heavy handed
   */
  @Override
  public synchronized void pauseListening() {
    log.info("Pausing Listening");
    SpeechRecognizerConfig c = config;

    c.listening = false;
    if (microphone != null && recognizer != null) {
      // TODO: what does reset monitors do? maybe clear the microphone?
      // maybe neither of these do anything useful
      microphone.stopRecording();
      // microphone.clear();
      // recognizer.resetMonitors();
    }
  }

  @Override
  public String publishText(String recognizedText) {
    return recognizedText;
  }

  /**
   * The main output for this service.
   * 
   * @return the word
   */
  @Override
  public String recognized(String word) {
    return word;
  }

  public String publishRequestConfirmation(String txt) {
    // TODO: rename this to publishRequestConfirmation
    return txt;
  }

  @Override
  public void resumeListening() {
    log.info("resuming listening");
    SpeechRecognizerConfig c = (SpeechRecognizerConfig)config;

    c.listening = true;
    recognizer.startRecognition(true);
  }

  // FYI - grammar must be created BEFORE we start to listen
  @Override
  public void startListening() {
    startListening(null); // use existing grammar
  }

  // FIXME - re-entrant - make it create new speechProcessor
  // assume its a new grammar
  public void startListening(String grammar) {
    if (speechProcessor != null) {
      log.warn("already listening");
      return;
    }

    StringBuffer newGrammar = new StringBuffer();
    buildGrammar(newGrammar, commands);
    buildGrammar(newGrammar, confirmations);
    buildGrammar(newGrammar, negations);
    buildGrammar(newGrammar, bypass);

    if (grammar != null) {
      if (newGrammar.length() > 0) {
        newGrammar.append("|");
      }
      newGrammar.append(cleanGrammar(grammar));
    }

    createGrammar(newGrammar.toString());

    speechProcessor = new SpeechProcessor(this);
    speechProcessor.start();
  }

  private String cleanGrammar(String grammar) {
    // sphinx doesn't like punctuation in it's grammar commas and periods give
    // it a hard time.
    String clean = grammar.replaceAll("[\\.\\,]", " ");
    return clean;
  }

  public void startRecordingx() {
    recognizer.startRecognition(true);
  }

  /**
   * stopRecording - it does "work", however, the speech recognition part seems
   * to degrade when startRecording is called. I have worked around this by not
   * stopping the recording, but by not processing what was recognized
   */
  @Override
  public void stopListening() {
    SpeechRecognizerConfig c = config;

    c.listening = false;
    if (recognizer != null) {
      recognizer.stopRecognition();
    }
    if (speechProcessor != null) {
      speechProcessor.isRunning = false;
    }
    speechProcessor = null;
  }

  @Override
  public void stopService() {
    super.stopService();
    stopListening();
  }

  @Override
  public void addMouth(SpeechSynthesis mouth) {
    if (mouth == null) {
      warn("can not attach mouth is null");
      return;
    }
    // if I'm speaking - I shouldn't be listening
    mouth.addEar(this);
    this.addListener("publishText", mouth.getName(), "onText");
    this.addListener("publishRequestConfirmation", mouth.getName(), "onRequestConfirmation");

    addListener("requestConfirmation", mouth.getName(), "onRequestConfirmation");
    log.info("attached Speech service {} to Sphinx service {} with default message routes", mouth.getName(), getName());

  }

  @Override
  public Map<String, Locale> getLocales() {
    return Locale.getLocaleMap("en-US");
  }

  @Override
  public void attachTextListener(String name) {
    addListener("publishText", name);
  }

}
