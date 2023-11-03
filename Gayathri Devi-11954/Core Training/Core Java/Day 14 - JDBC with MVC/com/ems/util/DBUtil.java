package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		// connection is a getting a connection object,
		// Step - 1 = Register or loading the driver name
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Step - 2 = Making connection with database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sample_jdbc_student", "root",
					"root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
