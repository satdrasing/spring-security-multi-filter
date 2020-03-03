package com.example.demo.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(99)
public class WebSecurityH2 extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .headers()
          .frameOptions()
          .disable()
        .and()
          .csrf()
          .disable()
        .antMatcher("/h2-console/**")
        .authorizeRequests()
          .anyRequest()
          .permitAll();
  }
}
