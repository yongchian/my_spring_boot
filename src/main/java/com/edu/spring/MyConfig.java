package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
  
  @Bean
  public Cat createCat() {
    return new Cat();
  }
  
  @Bean
  @Scope("prototype")
  public Jeep createJeep(JeepFactory jeepFactory) {
    return jeepFactory.create();
  }
  
  //@Bean
  public JeepFactory createJeepFactory() {
    return new JeepFactory();
  }
  
  
  @Bean(name = "myfistBean")
  @Scope("prototype")
  public MyBean createMyBean() {
    return new MyBean();
  }
  
  @Bean
  public RunnableFactoryBean createRunnableFactoryBean() {
    return new RunnableFactoryBean();
  }
}
