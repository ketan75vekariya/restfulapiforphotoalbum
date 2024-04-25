package com.restfulapiforphotoalbum.restfulapiforphotoalbum.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SicurityConfig {

  @Bean
  public InMemoryUserDetailsManager users() {

    return new InMemoryUserDetailsManager(
        User.withUsername("admin")
            .password("password")
            .authorities("read").build());
  }

  @SuppressWarnings("removal")
  @Bean
  public SecurityFilterChain secirityFilterChain(HttpSecurity http)
      throws Exception {
    http
        .authorizeHttpRequests()
        .requestMatchers("/token").permitAll()
        .requestMatchers("/").permitAll()
        .requestMatchers("/swagger-ui/**").permitAll()
        .requestMatchers("/v3/api-docs/**").permitAll()
        .requestMatchers("/test").permitAll();
    return http.build();
  }
}
