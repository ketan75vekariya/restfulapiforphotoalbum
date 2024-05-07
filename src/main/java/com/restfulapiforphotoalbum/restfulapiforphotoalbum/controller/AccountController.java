package com.restfulapiforphotoalbum.restfulapiforphotoalbum.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AccountController {
  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping("/test")
  @Tag(name = "Test", description = "The test api")
  @SecurityRequirement(name = "Demo-API")
  public String testApi() {
    return "Test Api";
  }

}
