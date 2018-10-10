package com.edu.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
  @RequestMapping(value = "/home")
  @ResponseBody
  public String home() {
    return "user home";
  }

  @PostMapping("/create")
  @ResponseBody
  public String create(@RequestParam("username") String username,
      @RequestParam(value = "password", required = false, defaultValue = "123") String password) {
    return "in the create, username is " + username + ", password is " + password;
  }
  
  @GetMapping("/{id}")
  @ResponseBody
  public String display(@PathVariable("id") String id) {
    return "in the display, id is " + id;
  }
}
