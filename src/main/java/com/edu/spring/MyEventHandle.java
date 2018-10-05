package com.edu.spring;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {
  @EventListener
  public void event(MyApplicationEvent event) {
    System.out.println("MyApplicationEvent 接收到事件： " + event.getClass());
  }
  
  @EventListener
  public void event2(ContextStoppedEvent event) {
    System.out.println("ContextStoppedEvent 接收到stop事件： " + event.getClass());
  }
}
