package com.sara.CoreJava.Day_13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc_Example05 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step -1 : Register or Loading the driver(forName())

		Class.forName("com.mysql.jdbc.Driver");

		// Step -2 : Making Connection with database

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin123");

		// Step - 3 : Creating Statement
		String sql = "insert into student_details values (?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		String msg = "";
		Scanner sc = new Scanner(System.in);
		
		// Step - 4 : Execute the Query
		do {
			System.out.println("Enter Student ID and Student Name : ");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			
			ps.addBatch();
			
			System.out.println("Do you want to continue [ Yes || No ]");
			msg = sc.next();
		}while (msg.equalsIgnoreCase("yes"));
		
		ps.executeBatch();
		
		// Step-5 : Closing
		ps.close();
		con.close();

	}

}
