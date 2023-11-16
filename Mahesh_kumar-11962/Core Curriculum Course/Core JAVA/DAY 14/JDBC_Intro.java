package com.mahesh.core_java_day_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Intro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step 1 -> Register or Loading the Driver
		//Class.forName("com.mysql.jdbc.Driver");
		
		//Step 2 -> Making Connection with DataBase
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Pa55w0rd@2k23");
		
		//Step 3 -> Create the Statement
		
		String sql ="insert into tbl_student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,5);
		ps.setString(2,"naidu");
		ps.setString(3,"Hindi");
		
		//Step -4 : Execute Query
		int n = ps.executeUpdate();
		if(n==1)
		{
			System.out.println("Record Inserted");
			
		}
		else
		{
			System.out.println("Record not Inserted");
		}
		
		//Step-5 :Close
		ps.close();
		con.close();
	}

}
