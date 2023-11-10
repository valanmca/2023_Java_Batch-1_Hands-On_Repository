package com.ems.util;

import java.sql.Connection;

import java.sql.DriverManager;

public class dbUTIL {

	public static Connection getDBConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root","Password@12345");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
		
		
	 

	}


}
