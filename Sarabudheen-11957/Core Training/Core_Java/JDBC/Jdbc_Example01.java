//JDBC Connections Example with ExecuteQuery Statement
package com.sara.CoreJava.Day_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_Example01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Step -1 : Register or Loading the driver(forName())

		Class.forName("com.mysql.jdbc.Driver");

		// Step -2 : Making Connection with database

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin123");

		// Step - 3 : Creating Statement
		String sql = "insert into student_details values (?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, 11961);
		ps.setString(2, "Chumma");

		// Step - 4 : Execute the Query
		int n = ps.executeUpdate();
		if (n == 1) {
			System.out.println("Record Inserted");
		} else {
			System.out.println("Record Not Inserted");
		}

		// Step-5 : Closing
		ps.close();
		con.close();
	}

}
