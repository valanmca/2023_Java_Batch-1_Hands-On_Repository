package com.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Creating Connection with DataBase.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product_Management_System", "root",
					"admin123");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
