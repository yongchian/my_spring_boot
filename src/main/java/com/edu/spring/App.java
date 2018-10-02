package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.edu.core.Role;
import com.edu.core.User;
import com.edu.core.UserConfiguration;


@EnableAutoConfiguration
@ComponentScan
public class App {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(App.class);
    ConfigurableApplicationContext context = app.run(args);
    System.out.println(context.getBean(Runnable.class));
    System.out.println(context.getBean(User.class));
    System.out.println(context.getBean(Role.class));
    System.out.println(context.getBean("gson"));
    context.close();
  }
}
