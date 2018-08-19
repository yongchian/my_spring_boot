package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class User {
  
  @Autowired
  private ApplicationContext applicationContext;
  
  public void init() {
    System.out.println("user init");
  }
  
  public void show() {
    System.out.println("in show, user: " + applicationContext.getClass());
  }
}
