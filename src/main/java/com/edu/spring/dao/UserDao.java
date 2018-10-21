package com.edu.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
  public void add(String username, String password) {
    System.out.println("username is " + username + ", password is " + password);
  }
}
