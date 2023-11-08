package com.vms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			// Step - 1 : Register or loading the driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step - 2 : Making Connection with Database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vms", "root", "Password@12345");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;

	}
}
