package com.edu.spring;



import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class App {
  public static void main(String[] args) throws BeansException, FileNotFoundException {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    context.getBean(ProductDao.class).addProductBatch("test1", "test2", "test3");
  }
}
