package com.edu.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService {
  private Logger log = LoggerFactory.getLogger(UserService.class);
  
  public void log() {
    log.debug("in the userService: the debug log");
    log.info("in the userService: the info log");
    log.warn("in the userService: the warn log");
    log.error("in the userService: the error log");
  }
  
  
}
