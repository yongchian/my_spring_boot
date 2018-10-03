package com.edu.spring;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {

  private static final long serialVersionUID = 6786479127862482044L;
  
  public MyApplicationEvent(Object source) {
    super(source);
    // TODO Auto-generated constructor stub
  }


}
