package com.springdemo.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("randomService")
  private FortuneService fortuneService;

  public TennisCoach() {
    System.out.println("Constructor innit");
  }

  /*
   * @Autowired
   * public TennisCoach(FortuneService fortuneService) {
   * this.fortuneService = fortuneService;
   * }
   */
  @Override
  public String getDailyWorkout() {
    return "lefthand wank";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  /*
   * @Autowired
   * public void setFortuneService(FortuneService fortuneService) {
   * System.out.println("In the setter innit");
   * this.fortuneService = fortuneService;
   * }
   */
}
