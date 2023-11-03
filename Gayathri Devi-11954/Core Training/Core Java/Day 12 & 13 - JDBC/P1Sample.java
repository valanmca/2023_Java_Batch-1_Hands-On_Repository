package com.gayathri.day13;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
import java.util.Scanner;

public class P1Sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		// Step - 1 = Register or loading the driver name
		Class.forName("com.mysql.jdbc.Driver");

		// Step - 2 = Making connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sample_jdbc_student", "root",
				"root");

		String sql = "insert into tbl_student values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		String msg = "";
		do {
			System.out.print("Enter student name : ");
			ps.setString(1, sc.next());
			System.out.print("Enter student id : ");
			ps.setInt(2, sc.nextInt());

			ps.addBatch();

			System.out.print("Do you want to continue ? [Yes | No] : ");
			msg = sc.next();
		} while (msg.equals("Yes"));
		ps.executeBatch();
		System.out.println("\nAll records are inserted");
		/*
		 * //Databasemetadata - provide information about database DatabaseMetaData
		 * dbdata = con.getMetaData();
		 * System.out.println("SQL Keywords : "+dbdata.getSQLKeywords());
		 * System.out.println("URL : "+dbdata.getURL());
		 * System.out.println("User name : "+dbdata.getUserName());
		 * 
		 */
		// Step - 3 = Creating Statement

		/*
		 * String sql = "insert into tbl_student values(?,?)"; PreparedStatement ps =
		 * con.prepareStatement(sql); ps.setString(1, "Pravin"); ps.setInt(2, 11946);
		 * 
		 * String sql = "select * from tbl_student"; PreparedStatement ps =
		 * con.prepareStatement(sql);
		 */
		// step - 4 = Execute the query
		/*
		 * ResultSet rs = ps.executeQuery(); //ResultMetaData = get the information
		 * about result set. ResultSetMetaData data = rs.getMetaData();
		 * System.out.println("Total columns in the table : "+data.getColumnCount());
		 * for(int i=1;i<=data.getColumnCount();i++) { System.out.println(i+
		 * " - column name : "+
		 * data.getColumnName(i)+" class name : "+data.getColumnClassName(i)); }
		 * while(rs.next()) {
		 * System.out.println(rs.getString("sname")+" "+rs.getInt("sid")); }
		 */

		/*
		 * int n = ps.executeUpdate(); if(n==1) System.out.println("Recored Inserted");
		 * else System.out.println("Recored not Inserted");
		 */

		// Step - 5 Closing the connection
		// rs.close();
		ps.close();
		con.close();

	}

}
