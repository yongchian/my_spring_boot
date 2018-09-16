package com.edu.spring;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Utf8Condtion implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    String encoding = System.getProperty("file.encoding");
    if("utf8".equalsIgnoreCase(encoding)) {
      return true;
    }
    return false;
  }

}
