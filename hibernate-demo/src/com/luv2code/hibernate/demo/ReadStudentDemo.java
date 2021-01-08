package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

  public static void main(String[] args) {
    SessionFactory factory =
        new Configuration().configure("hibernate.cfg.xml")
                               .addAnnotatedClass(Student.class)
                               .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {
      Student student = new Student("daf", "fy", "daf@xd.com");
      session.beginTransaction();
      session.save(student);
      session.getTransaction().commit();

      session = factory.getCurrentSession();
      session.beginTransaction();
      Student student2 = session.get(Student.class, student.getId());

      System.out.println(student2.getId());
      session.getTransaction().commit();

    } finally {
      factory.close();
    }
  }

}
