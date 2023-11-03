package com.naveen.day_11;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.ResultSetMetaData;

public class Ex01_Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step-1 : Register or Loading the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step-2 : Making Connection with  database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");
		DatabaseMetaData data1 = con.getMetaData();
		System.out.println(data1.getSQLKeywords());
		System.out.println(data1.getURL());
		System.out.println(data1.getUserName());
		
		
		//Step-3 : Creating Statement
		//Select Query
		String sql = "select * from tbl_employee";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		
		/*//Insert Query
		 * String sql = "insert into tbl_employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 102);
		ps.setString(2, "Arun");
		ps.setInt(3, 6555);*/
		
		//Step-4 : Execute the Query
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData data = rs.getMetaData();
		System.out.println(data.getColumnCount()); //3
		for(int i=1; i<=data.getColumnCount(); i++) {
			System.out.print(data.getColumnName(i)+" ");
		}
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt("emp_id")+"    "+ rs.getString("emp_name") +"    "+rs.getInt("salary") );
		}
		
		
		
		
		/*//Insert Query
		 * int n = ps.executeUpdate();
		if(n==1) {
			System.out.println("Record Inserted");
		}
		else {
			System.out.println("Record Not Inserted");
		}*/
		
		
		
		
		
		//Step-5 : Closing
		
		ps.close();
		con.close();
	}

}
