package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studemo","root", "admin123");
		} catch (Exception e) {


		}
		return con;

}
}

