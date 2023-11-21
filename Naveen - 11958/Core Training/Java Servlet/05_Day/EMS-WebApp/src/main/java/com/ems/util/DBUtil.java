package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {

		Connection con = null;
		try {
			// Step-1 : Register or Loading the driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step-2 : Making Connection with database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
