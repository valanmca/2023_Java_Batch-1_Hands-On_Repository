package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con =null;
		
		try {
			String url ="jdbc:mysql://localhost:3306/studentdetails";
			String userName ="root";
			String password = "Password@12345";
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
		return con;

	}

}
