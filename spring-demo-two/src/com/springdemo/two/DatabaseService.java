package com.springdemo.two;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements FortuneService {

  @Override
  public String getFortune() {
    return "DatabaseService";
  }

}
