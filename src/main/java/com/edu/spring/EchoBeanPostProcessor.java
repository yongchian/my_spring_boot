package com.edu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
    System.out.println("after : " + arg0.getClass());
    return arg0;
  }

  @Override
  public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
    System.out.println("before: " + arg0.getClass());
    return arg0;
  }

}
