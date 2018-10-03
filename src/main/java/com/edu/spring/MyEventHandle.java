package com.edu.spring;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {
  @EventListener
  public void event(Object event) {
    System.out.println("MyApplicationEvent 接收到事件： " + event.getClass());
  }
}
