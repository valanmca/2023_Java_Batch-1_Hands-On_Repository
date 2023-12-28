package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static Connection getDbConnection() {
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		} catch (SQLException e) {

			e.printStackTrace();

		}
		return con;

	}
}