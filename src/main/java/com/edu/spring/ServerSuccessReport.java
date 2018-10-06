package com.edu.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class ServerSuccessReport implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("===========in the ServerSuccessReport=============");
    
  }

}
