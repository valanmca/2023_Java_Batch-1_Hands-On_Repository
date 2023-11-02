package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection getDBConnection() {
		
		Connection con=null;
		try {
			
		
		       //Step-1: Register or Loading the Driver
		
				Class.forName("com.mysql.jdbc.Driver");
				
				// Step-2 //making Connection with.Jdbc.Driver
				
				
				String url="jdbc:mysql://localhost:3306/Student";
				String userName="root";
				String password="root";
				
				
				con=DriverManager.getConnection(url, userName, password);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
		
	}

}
