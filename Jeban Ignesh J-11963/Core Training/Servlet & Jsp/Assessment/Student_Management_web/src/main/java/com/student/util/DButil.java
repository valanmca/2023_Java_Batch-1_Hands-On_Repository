package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static Connection getDbConnection() throws ClassNotFoundException {
		Connection con = null;

		try {
			 Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		} catch (SQLException e) {

			e.printStackTrace();

		}
		return con;

	}
}
