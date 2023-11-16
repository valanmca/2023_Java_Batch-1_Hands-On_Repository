package com.mahesh.core_java_day_14;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetDemo {

	public static void main(String[] args) throws SQLException {

		// TODO Auto-generated method stub
		// Step 1 -> Register or Loading the Driver
		// Class.forName("com.mysql.jdbc.Driver");

		// Step 2 -> Making Connection with DataBase

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Pa55w0rd@2k23");

		DatabaseMetaData metadata = con.getMetaData();
		System.out.println("SQL Keywords : "+metadata.getSQLKeywords()+"\n");
		System.out.println("SQL URL PATH : "+metadata.getURL()+"\n");
		System.out.println("SQL USERNAME : "+metadata.getUserName()+"\n");

		// Step 3 -> Create Statement
		String sql = "Select * from tbl_student";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet re = ps.executeQuery();
		ResultSetMetaData data = re.getMetaData();
		System.out.println(data.getColumnCount());
		for (int i = 1; i <= data.getColumnCount(); i++) {
			System.out.print(data.getColumnName(i) + " ");
		}
		System.out.println("\n");
		while (re.next()) {
			System.out.println(re.getInt("student_id") + " - " + re.getString("student_name") + " - "
					+ re.getString("student_dept"));
		}

		re.close();
		ps.close();
		con.close();

	}

}
