package com.edu.spring;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Jeep implements Runnable {
  @Override
  @Async
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("==============");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

}
