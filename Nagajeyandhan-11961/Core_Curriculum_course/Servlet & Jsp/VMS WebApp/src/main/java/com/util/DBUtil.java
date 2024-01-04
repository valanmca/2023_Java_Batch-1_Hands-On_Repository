package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vmsservlet","root","admin123");
			
		} catch (Exception e) {
			System.out.println("Exception in connection");
		}
		return con;
	}
}
