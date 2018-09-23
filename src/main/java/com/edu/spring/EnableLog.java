package com.edu.spring;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableLog {
  String name();
}
