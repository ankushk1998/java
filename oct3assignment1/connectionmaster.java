package com.java.oct3assignment1;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionmaster {
	static String URL="jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME="root";
	static String PASSWORD="root";
	public static Connection getconnection() {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
