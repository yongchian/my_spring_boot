package com.edu.spring;

import java.io.FileNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @GetMapping("/user/home")
  public String home() {
    System.out.println("in the user home");
    return "user home";
  }
  
  @GetMapping("/user/test")
  public String test() throws FileNotFoundException {
    System.out.println("in the user test");
    throw new FileNotFoundException();
  }
}
