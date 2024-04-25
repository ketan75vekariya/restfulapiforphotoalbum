package com.restfulapiforphotoalbum.restfulapiforphotoalbum.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AccountController {
  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping("/test")
  public String testApi() {
    return "Test Api";
  }

}
