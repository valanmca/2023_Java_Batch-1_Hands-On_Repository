package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {

	public static Connection getDBConnection()  {

		Connection con=null;
		
		try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root","Password@12345");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
		
	}

}
