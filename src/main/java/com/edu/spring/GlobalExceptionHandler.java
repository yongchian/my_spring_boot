package com.edu.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public String errorHandler(Exception e) {
    return "Global Exception error " + e.getClass().getName();
  }

  // 运行时异常
  @ExceptionHandler(RuntimeException.class)
  @ResponseBody
  public String runtimeExceptionHandler(RuntimeException e) {
    return "Global RuntimeException error " + e.getClass().getName();
  }
}
