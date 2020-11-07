package com.springdemo;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  private String emailadress;
  private String team;


  public String getEmailadress() {
    return emailadress;
  }

  public String getTeam() {
    return team;
  }

  public void setEmailadress(String emailadress) {
    System.out.println("Are you dumb?");
    this.emailadress = emailadress;
  }

  public void setTeam(String team) {
    System.out.println("Stupid or dumb?");
    this.team = team;
  }

  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("Hey cousin wanna go bowling?");
    this.fortuneService = fortuneService;
  }

  public CricketCoach() {
    System.out.println("We be calling");
  }

  @Override
  public String getDailyWorkout() {
    return "Bawler";
  }

  @Override
  public String getDailyFortunes() {
    return fortuneService.getFortune();
  }

}
