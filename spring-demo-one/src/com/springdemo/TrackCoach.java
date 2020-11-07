package com.springdemo;

public class TrackCoach implements Coach {


  private FortuneService fortuneService;

  public TrackCoach() {}

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {

    return "cunt";
  }

  @Override
  public String getDailyFortunes() {
    return "Never ever fucking " + fortuneService.getFortune();
  }

  public void initStuff() {
    System.out.println("Doing initstuff innit");
  }

  public void destroyStuff() {
    System.out.println("Doing my destroy stuff");
  }

}
