package com.jeyandhan.day12;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:sql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "admin123";
		String query = "select * from tbl_employee";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next(); //move to next record
		System.out.println("Id is "+rs.getInt(1)); // column number (sql database)
		System.out.println("Name is "+rs.getString(2));
		System.out.println("Salary is "+rs.getInt(3));
		
		con.close();
	}

}
