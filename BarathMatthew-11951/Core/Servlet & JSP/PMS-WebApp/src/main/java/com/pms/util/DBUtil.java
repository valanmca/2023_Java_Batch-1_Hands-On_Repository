package com.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws ClassNotFoundException {
		Connection con =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/servlet";
			String userName ="root";
			String password = "Password@12345";
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return con;

	}

}

