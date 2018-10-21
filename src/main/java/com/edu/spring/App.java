package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.edu.spring.boot.redis.EnableRedis;

import redis.clients.jedis.Jedis;

@EnableRedis
@SpringBootApplication
public class App {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    Jedis jedis = context.getBean(Jedis.class);
    jedis.set("id", "aaa");
    System.out.println("value is " + jedis.get("id"));
    context.close();
  }
}
