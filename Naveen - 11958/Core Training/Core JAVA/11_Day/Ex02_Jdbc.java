package com.naveen.day_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Step-1 : Register or Loading the driver
		Class.forName("com.mysql.jdbc.Driver");

		// Step-2 : Making Connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");

		String sql = "insert into tbl_employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		String msg = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter employee id, name and salary :");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setInt(3, sc.nextInt());

			ps.addBatch();
			System.out.println("Do you want to continue [yes | no]");
			msg = sc.next();
		} while (msg.equals("yes"));
		
		ps.executeBatch();
		
		System.out.println("All records inserted");
		
		ps.close();
		con.close();
	}
}