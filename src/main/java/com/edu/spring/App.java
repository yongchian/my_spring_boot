package com.edu.spring;



import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.edu.spring.dao.UserDao;

@SpringBootApplication
public class App {
  public static void main(String[] args) throws BeansException, FileNotFoundException {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    context.getBean(UserDao.class).add("admin", "123");
    context.close();
  }
}
