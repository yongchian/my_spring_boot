package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
  
  @Bean
  public Runnable createRunnable() {
    return () -> {System.out.println("spring is running!!!");};
  }
  
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    context.getBean(Runnable.class).run();
  }
}
