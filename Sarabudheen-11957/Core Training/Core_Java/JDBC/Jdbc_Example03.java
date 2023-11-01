//Example for ResultSetMetaData
package com.sara.CoreJava.Day_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Jdbc_Example03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step -1 : Register or Loading the driver(forName())

		Class.forName("com.mysql.jdbc.Driver");

		// Step -2 : Making Connection with database

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin123");

		// Step - 3 : Creating Statement
		String sql = "Select * from student_details";
		PreparedStatement ps = con.prepareStatement(sql);

		// Step - 4 : Execute the Query
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData metadata = rs.getMetaData();
		System.out.println(metadata.getColumnCount());
		for (int i = 1; i <= metadata.getColumnCount(); i++) {
			System.out.print(metadata.getColumnName(i) + " ");
		}
		System.out.println(" ");
		while (rs.next()) {
			System.out.println(rs.getInt("Student_Id") + "      " + rs.getString("Student_Name"));
		}

		// Step-5 : Closing
		rs.close();
		ps.close();
		con.close();
	}

}
