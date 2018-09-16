package com.edu.spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class UserConfigration {
  @Bean
  @ConditionalOnProperty(name = "runnable.enabled", havingValue = "aaa")
  public Runnable createRunnable() {
    return () -> {
    };
  }
}
