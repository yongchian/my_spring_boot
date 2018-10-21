package com.edu.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
  @Before("execution(* com.edu.spring.dao..*.*(..))")
  public void log() {
    System.out.println("in the log!!!");
  }
}
