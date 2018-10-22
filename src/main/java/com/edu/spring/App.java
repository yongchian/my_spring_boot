package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.edu.spring.dao.UserDao;
import com.edu.spring.service.UserService;


@SpringBootApplication(exclude=WebMvcAutoConfiguration.class)
public class App {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    context.getBean(UserDao.class).log();
    context.getBean(UserService.class).log();
    context.close();
  }
}

