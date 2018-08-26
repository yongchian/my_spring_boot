package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.edu.spring");
    context.getEnvironment().getProperty("local.ip");
    context.close();
  }
}
