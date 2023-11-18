package com.purushoth.day_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step-1 : Register or Loading the driver 
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step-2 : Making Connection with Database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "root");

		//Step-3 : Create Statement
		String query="insert into sample values (?,?,?)";
		PreparedStatement  ps = con.prepareStatement(query);
		ps.setInt(1, 101);
		ps.setString(2, "Sandy");
		ps.setFloat(3, 30000);
		
		//Step-4 : Execute Query
		int n=ps.executeUpdate();
		if(n==1) {
			System.out.println("Record Inserted");
		}else {
			System.out.println("Record Not Inserted");
		}
		
		//Step-5 : Close
		con.close();
	}

}
