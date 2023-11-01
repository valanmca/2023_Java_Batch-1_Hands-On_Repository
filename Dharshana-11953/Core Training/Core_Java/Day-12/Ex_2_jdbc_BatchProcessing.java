package com.dharshu.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_2_jdbc_BatchProcessing {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Step - 1 : Register or loading the driver
		//Class.forName("com.mysql.jdbc.Driver.class");
				
				//Step - 2 : Making Connection with Database
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Password@12345");
				String sql = "insert into tbl_student values (?, ?, ?)" ;
				PreparedStatement ps = con.prepareStatement(sql);
				String msg = "";
				do {
					System.out.println("Enter Student id, name, depart");
					ps.setInt(1, sc.nextInt());
					ps.setString(2, sc.next());
					ps.setString(3, sc.next());
					
					ps.addBatch();
					System.out.println("Do you want to continue [Yes | No]");
					msg = sc.next();
				}while (msg.equals("Yes"));
				ps.executeBatch();
				System.out.println("All records are inserted");
				
				//Step - 5 : Closing
				ps.close();
				con.close();
	}

}
