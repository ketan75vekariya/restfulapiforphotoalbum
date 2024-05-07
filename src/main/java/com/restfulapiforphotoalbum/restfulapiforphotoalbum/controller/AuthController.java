package com.restfulapiforphotoalbum.restfulapiforphotoalbum.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restfulapiforphotoalbum.restfulapiforphotoalbum.payload.auth.Token;
import com.restfulapiforphotoalbum.restfulapiforphotoalbum.payload.auth.UserLogin;
import com.restfulapiforphotoalbum.restfulapiforphotoalbum.service.TokenService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class AuthController {
  private final AuthenticationManager authenticationManager;
  private final TokenService tokenService;

  public AuthController(TokenService tokenService, AuthenticationManager authenticationManager) {
    this.tokenService = tokenService;
    this.authenticationManager = authenticationManager;
  }

  @PostMapping("/token")
  @ResponseBody
  public Token token(@RequestBody UserLogin userLogin) throws AuthenticationException {
    Authentication authentication = authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(userLogin.username(), userLogin.password()));
    return new Token(tokenService.generateToken(authentication));
  }

}
