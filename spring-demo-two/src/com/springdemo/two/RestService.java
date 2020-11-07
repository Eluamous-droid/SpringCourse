package com.springdemo.two;

import org.springframework.stereotype.Component;

@Component
public class RestService implements FortuneService {

  @Override
  public String getFortune() {
    return "Rest Service";
  }

}
