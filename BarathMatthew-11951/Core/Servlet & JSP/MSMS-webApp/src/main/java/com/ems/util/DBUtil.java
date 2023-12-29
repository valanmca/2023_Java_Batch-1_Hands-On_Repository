package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			String url="jdbc:mysql://localhost:3306/mobile_Show";
			String username="root";
			String password="Password@12345";
			con = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

}

