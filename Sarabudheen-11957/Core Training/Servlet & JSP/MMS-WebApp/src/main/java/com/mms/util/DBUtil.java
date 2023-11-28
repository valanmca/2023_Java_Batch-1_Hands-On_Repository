package com.mms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Movies_Management_System", "root", "admin123"); // Creating Connection with DataBase.
																										
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;

	}

}
