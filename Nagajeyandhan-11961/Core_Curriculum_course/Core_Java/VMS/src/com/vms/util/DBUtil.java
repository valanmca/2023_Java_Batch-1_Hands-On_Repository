package com.vms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection() {
		Connection con = null;
		 try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "admin123");
		} catch (SQLException e) {
			System.err.println("Connection error");
		}
		 return con;
	}
	
	
}
