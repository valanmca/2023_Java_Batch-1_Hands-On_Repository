package com.ems.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		Connection cons = null;
		try {
			// Step - 1 : - Register or Loading the Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Step - 2 : - Making Connection with DataBases
			cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return cons;
	}
}




