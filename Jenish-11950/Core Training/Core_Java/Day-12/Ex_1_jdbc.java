package com.jenish.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DatabaseMetaData;

import java.sql.ResultSetMetaData;

public class Ex_1_jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step - 1 : Register or loading the driver
		// Class.forName("com.mysql.jdbc.Driver.class");

		// Step - 2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "admin123");
		DatabaseMetaData data1 = con.getMetaData();
		System.out.println(data1.getSQLKeywords());
		System.out.println(data1.getURL());
		System.out.println(data1.getUserName());

		// Step - 3 : Creating Statement
		// String sql = "insert into tbl_student values (?, ?, ?)" ;

		String sql = "select * from tbl_student";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setInt(1, 101);
//		ps.setString(2, "Jenish");
//		ps.setString(3, "CSE");

		// Step - 4 : Execute the Query
//		int n = ps.executeUpdate();
//		if(n == 1) {
//			System.out.println("Record Inserted");
//		} else {
//			System.out.println("Record not Inserted");
//		}

		ResultSet rs = ps.executeQuery();
		ResultSetMetaData data = rs.getMetaData();
		System.out.println(data.getColumnCount()); // 3
		for (int i = 1; i <= data.getColumnCount(); i++) {
			System.out.print(data.getColumnName(i) + "");
		}
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt("stud_id") + rs.getString("stud_name") + rs.getString("stud_depart"));
		}

		// Step - 5 : Closing
		ps.close();
		con.close();
	}

}
