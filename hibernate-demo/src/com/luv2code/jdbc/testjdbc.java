package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class testjdbc {

  public static void main(String[] args) {

    String jdbcurl =
        "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=GMT";

    String user = "hbstudent";
    String pass = "hbstudent";

    try {
      System.out.println("Connecting to db");

      Connection conn = DriverManager.getConnection(jdbcurl, user, pass);

    }
    catch(Exception e) {
      e.printStackTrace();
    }

  }

}
