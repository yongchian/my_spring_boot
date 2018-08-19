package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.edu.spring");
    //System.out.println(context.getBean("createUser"));
    //System.out.println(context.getBean(User.class));
    //context.getBean("user", User.class).show();
    context.getBeansOfType(Person.class).values().forEach(System.out::println);
    context.close();
  }
}
