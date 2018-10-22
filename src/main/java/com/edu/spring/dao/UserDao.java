package com.edu.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
  private Logger log = LoggerFactory.getLogger(UserDao.class);
  
  public void log() {
    log.debug("the debug log");
    log.info("the info log");
    log.warn("the warn log");
    log.error("the error log");
  }
  
  
}
