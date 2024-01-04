package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
public static Connection getDBConnection() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "admin123");
			
		} catch (Exception e) {
			System.err.println("Exception in connection");
		}
		
		return con;
}
}
