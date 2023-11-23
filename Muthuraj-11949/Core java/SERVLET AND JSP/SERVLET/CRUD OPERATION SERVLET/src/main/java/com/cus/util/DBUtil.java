package com.cus.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cus4", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}