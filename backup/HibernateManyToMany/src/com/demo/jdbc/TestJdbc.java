package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/many_to_many?useSSL=false&serverTimezont=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("connecting ..." + jdbcUrl);

			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("connection success");
		} catch (Exception e) {
			System.out.println("unsuccess " + e);
		}
	}

}
