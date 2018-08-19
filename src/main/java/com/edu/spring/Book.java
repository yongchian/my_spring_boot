package com.edu.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Book implements ApplicationContextAware {
  
  private ApplicationContext applicationContext;
  
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
    
  }
  
  public void show() {
    System.out.println("in show, book: " + applicationContext.getClass());
  }

}
