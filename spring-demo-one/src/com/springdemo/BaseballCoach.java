package com.springdemo;

public class BaseballCoach implements Coach {

  private FortuneService fortuneService;

  public BaseballCoach(FortuneService fortuneService) {

    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "wanker";
  }

  @Override
  public String getDailyFortunes() {
    return fortuneService.getFortune();
  }

}
