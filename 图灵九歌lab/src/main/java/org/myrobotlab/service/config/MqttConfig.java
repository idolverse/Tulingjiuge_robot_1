package org.myrobotlab.service.config;

public class MqttConfig extends ServiceConfig {

  public String username;
  public String password;
  public String address = "0.0.0.0";
  public Integer mqttPort = 1883;
  public Integer wsPort = 8080;

}
