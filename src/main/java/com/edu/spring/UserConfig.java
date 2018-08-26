package com.edu.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {
  
  @Value("${local.port}")
  private String port;
  
  @Value("${local.port2}")
  private Integer port2;
  
  @Value("${local.port3:22}")
  private Integer port3;
  
  public void show() {
    System.out.println("port is: " + port);
    System.out.println("port2 is: " + port2);
    System.out.println("port3 is: " + port3);
  }
}
