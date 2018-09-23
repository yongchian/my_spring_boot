package com.edu.spring;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLog.class.getName()));
    return new String[] {"com.edu.spring.User", Role.class.getName()};
  }

}
