/**
 *                    
 * @author grog (at) myrobotlab.org
 * 
 * */

package org.myrobotlab.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.myrobotlab.framework.Message;
import org.myrobotlab.framework.Service;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.service.config.ClockConfig;
import org.slf4j.Logger;

/**
 * Clock - This is a simple clock service that can be started and stopped. It
 * generates a pulse with a timestamp on a regular interval defined by the
 * setInterval(Integer) method. Interval is in milliseconds.
 */
public class Clock extends Service<ClockConfig> {

  public class ClockThread implements Runnable {

    private transient Thread thread = null;
    

    @Override
    public void run() {

      try {

        config.running = true;
        invoke("publishClockStarted");
        while (config.running) {
          Thread.sleep(config.interval);
          Date now = new Date();
          for (Message msg : events) {
            send(msg);
          }
          invoke("pulse", now);
          invoke("publishTime", now);
          invoke("publishEpoch", now);
        }
      } catch (InterruptedException e) {
        log.info("ClockThread interrupt");
      }
      config.running = false;
      thread = null;
    }

    // FIXME - synchronized methods is silly here - access needs to be
    // synchronized "between" start & stop
    // TODO - create and use a single thread - use wait(sleep) notify for
    // control
    synchronized public void start() {
      if (thread == null) {
        thread = new Thread(this, getName() + "_ticking_thread");
        thread.start();                
      } else {
        log.info("{} already started", getName());
      }
    }

    synchronized public void stop() {

      if (thread != null) {
        thread.interrupt();
        broadcastState();
      } else {
        log.info("{} already stopped", getName());
      }
      config.running = false;
      Service.sleep(20);
    }
  }
  
  private static final long serialVersionUID = 1L;

  final public static Logger log = LoggerFactory.getLogger(Clock.class);

  final protected transient ClockThread myClock = new ClockThread();

  /**
   * list of messages the clock can send - these are set with addClockEvent
   */
  final protected List<Message> events = new ArrayList<>();

  public Clock(String n, String id) {
    super(n, id);
  }

  public void addClockEvent(String name, String method, Object... data) {
    Message event = Message.createMessage(getName(), name, method, data);
    events.add(event);
  }

  /**
   * clears all the clock events
   */
  public void clearClockEvents() {
    events.clear();
  }

  /**
   * event published for when the clock is started
   */
  public void publishClockStarted() {
    log.info("clock started");
    broadcastState();
  }

  /**
   * the clock was stopped event
   */
  public void publishClockStopped() {
    log.info("clock stopped");
    broadcastState();
  }

  /**
   * date is published at an interval here
   * 
   * @param time
   *          t
   * @return t
   */
  @Deprecated /* use publishTime or preferably publishEpoch as epoch is in a useful millisecond value */
  public Date pulse(Date time) {
    return time;
  }

  /**
   * publishing point for a the current date object
   * @param time
   * @return
   */
  public Date publishTime(Date time) {
    return time;
  }

  /**
   * publishing point for epoch
   * @param time - epoch value, number of milliseconds from Jan 1 1970
   * @return
   */
  public long publishEpoch(Date time) {
    return time.getTime();
  }

  /**
   * set the interval of clock events to the current millisecond value
   * @param milliseconds
   */
  public void setInterval(Integer milliseconds) {
    config.interval = milliseconds;
    broadcastState();
  }

  @Deprecated /* use startClock skipFirst is default behavior */
  public void startClock(boolean skipFirst) {
    startClock();
  }

  /**
   * start the clock
   */
  public void startClock() {
    myClock.start();
  }

  /**
   * see if the clock is running
   * @return
   */
  public boolean isClockRunning() {
    return config.running;
  }

  /**
   * stop a clock
   */
  public void stopClock() {
    myClock.stop();
  }

  @Override
  public void stopService() {
    super.stopService();
    stopClock();
  }

  /**
   * return the current interval in milliseconds
   * @return
   */
  public Integer getInterval() {
    return config.interval;
  }

  public ClockConfig apply(ClockConfig c) {    
    super.apply(c);
    if (c.running != null) {
      if (c.running) {
        startClock();
      } else {
        stopClock();
      }
    }
    return c;
  }

  public void restartClock() {
    stopClock();
    startClock();
  }

  public static void main(String[] args) throws Exception {
    try {

//      WebGui webgui = (WebGui)Runtime.create("webgui", "WebGui");
//      webgui.autoStartBrowser(false);
//      webgui.setPort(8887);
//      webgui.startService();

      Clock c1 = (Clock) Runtime.start("c1", "Clock");
      Runtime.setLogLevel("ERROR");
      // c1.startClock();
      Runtime.getInstance().connect("ws://localhost:8888");
      
      boolean done = true;
      if (done) return;
      
      
      Runtime.getInstance().connect("ws://localhost:8888");
      c1.stopClock();

      Runtime.start("servo", "Servo");
    } catch (Exception e) {
      log.error("main threw", e);
    }
  }



}