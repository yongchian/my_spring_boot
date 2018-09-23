package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Hello world!
 *
 */
@EnableConfigurationProperties
@ComponentScan
@EnableAsync
//@SpringBootApplication
//@Import(User.class)
//@Import(MyImportSelector.class)
@EnableLog(name = "my test")
public class App2 {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
    //System.out.println(context.getBean(TomcatProperties.class));
    System.out.println(context.getBean(User.class));
    System.out.println(context.getBean(Role.class));
    context.close();
  }
}
