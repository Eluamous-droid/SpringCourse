package com.springdemo.two;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

  String[] fortunes = new String[] {"Banana", "Pear", "Apple"};

  @Override
  public String getFortune() {
    return fortunes[new Random().nextInt(fortunes.length)];
  }

}
