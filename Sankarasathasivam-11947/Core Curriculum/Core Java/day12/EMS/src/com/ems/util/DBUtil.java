package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		
		Connection con = null;
		try {
			// Step-1 : Register or Loading the Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step-2 : Making Connection with Database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin123");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
