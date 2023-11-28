package com.tms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher", "root", "admin123");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
