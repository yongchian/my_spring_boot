package com.edu.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
  @GetMapping("/role/home")
  public String home() {
    return "role home";
  }
}
