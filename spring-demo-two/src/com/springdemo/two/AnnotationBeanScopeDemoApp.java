package com.springdemo.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationcontext.xml");

    Coach coach = context.getBean("tennisCoach", Coach.class);

    Coach coach2 = context.getBean("tennisCoach", Coach.class);

    if (coach == coach2) {
      System.out.println("They same innit");
    }

    context.close();

  }

}
