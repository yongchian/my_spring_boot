package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
  //--spring.config.name=app
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    System.out.println(context.getEnvironment().getProperty("local.ip"));
    context.getBean(UserConfig.class).show();
    context.close();
  }
}
