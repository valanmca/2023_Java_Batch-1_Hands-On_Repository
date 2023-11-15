package com.vms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getDBConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vehicle", "root", "admin123");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
