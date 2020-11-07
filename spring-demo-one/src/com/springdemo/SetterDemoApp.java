package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");


    CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortunes());

    System.out.println(coach.getEmailadress());
    System.out.println(coach.getTeam());


    context.close();
  }

}
