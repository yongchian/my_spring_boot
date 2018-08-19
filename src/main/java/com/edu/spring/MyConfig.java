package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
  
  @Bean(initMethod="init")
  public User createUser() {
    return new User();
  }
  
  @Bean
  public User createUser2() {
    return new User();
  }
}
