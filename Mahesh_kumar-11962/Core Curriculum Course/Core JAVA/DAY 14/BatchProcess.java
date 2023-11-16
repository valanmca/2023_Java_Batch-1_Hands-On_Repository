package com.mahesh.core_java_day_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcess {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Pa55w0rd@2k23");

		String sql = "insert into tbl_student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		String msg ="";
		do
		{
			System.out.print("Enter Student id :");
			ps.setInt(1,sc.nextInt() );
			System.out.print("Enter Student Name :");
			ps.setString(2, sc.next());
			System.out.print("Enter Student Dept :");
			ps.setString(3, sc.next());
			
			ps.addBatch();
			System.out.print("U want repeat enter 'yes' : ");
			msg = sc.next();
			
		}while(msg.equalsIgnoreCase("yes"));
		ps.executeBatch();
		System.out.println("All records are inserted");
		ps.close();
		con.close();


	}

}
