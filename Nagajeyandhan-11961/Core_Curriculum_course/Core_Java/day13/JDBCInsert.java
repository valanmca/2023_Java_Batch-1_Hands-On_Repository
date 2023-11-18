package com.jeyandhan.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 Register or Loading the driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 Create a connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "admin123");
		
		//step 4 Create Statement
		String query  = "insert into student values(?, ?, ?)";
		
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1, 24);
		pst.setString(2, "Ram");
		pst.setString(3, "Cse");
		
		//step 4 Execute the query
		
		int n = pst.executeUpdate();
		if(n==1) {
			System.out.println("Records inserted");
		}else {
			System.out.println("Records not inserted");
		}
		
		//step 5 close the connection
		
		pst.close();
		con.close();
	}

}
