package com.edu.spring;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

  @Override
  public void contextDestroyed(ServletContextEvent arg0) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void contextInitialized(ServletContextEvent arg0) {
    System.out.println("in the MyContextListener");
    
  }

}
