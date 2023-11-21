package com.ems.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class DBUtil {
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		Connection cons = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return cons;

	}
}
