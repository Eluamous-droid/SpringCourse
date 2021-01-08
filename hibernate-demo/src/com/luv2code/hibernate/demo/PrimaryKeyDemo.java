package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

  public static void main(String[] args) {
    SessionFactory factory =
        new Configuration().configure("hibernate.cfg.xml")
                               .addAnnotatedClass(Student.class)
                               .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {
      Student student1 = new Student("x", "d", "student1@xd.com");
      Student student2 = new Student(":", "D", "student2@xd.com");
      Student student3 = new Student("8", "D", "student3@xd.com");
      session.beginTransaction();
      session.save(student1);
      session.save(student2);
      session.save(student3);
      session.getTransaction().commit();

    } finally {
      factory.close();
    }
  }

}
