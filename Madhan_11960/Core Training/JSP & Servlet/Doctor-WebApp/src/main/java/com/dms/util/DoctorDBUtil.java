package com.dms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root", "admin123");
		} catch (Exception e) {


		}
		return con;

}

}
