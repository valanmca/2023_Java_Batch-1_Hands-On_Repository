package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentManagementSystem", "root", "root");
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
		System.out.println("Exception in connection");		}
		return con;
	}
}
