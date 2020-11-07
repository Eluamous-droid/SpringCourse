package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("beanscopecontext.xml");


    Coach theCoach = context.getBean("myCoach", Coach.class);

    Coach alphaCoach = context.getBean("myCoach", Coach.class);

    boolean result = (theCoach == alphaCoach);

    System.out.println(result);

    System.out.println("mem xd " + theCoach + " " + alphaCoach);

    context.close();

  }

}
