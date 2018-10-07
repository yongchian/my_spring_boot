package com.edu.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.google.gson.Gson;


@SpringBootApplication(scanBasePackages="com.edu.spring",exclude=GsonAutoConfiguration.class)
public class App {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(App.class);
    ConfigurableApplicationContext context = app.run(args);
    System.out.println(context.getBean(Runnable.class));
    System.out.println(context.getBean(Gson.class));
    context.close();
  }
}
