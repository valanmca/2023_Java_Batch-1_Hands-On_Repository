package com.purushoth.day_12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcView {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step-1 : Register or Loading the driver 
		//Class.forName("com.mysql.jdbc.Driver");
				
		//Step-2 : Making Connection with Database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "root");
        DatabaseMetaData data1=con.getMetaData();  // For database information.
        System.out.println(data1.getSQLKeywords());
        System.out.println(data1.getURL());
        System.out.println(data1.getUserName());
		
		//Step-3 : Create Statement
		String query="select * from sample";
		PreparedStatement  ps = con.prepareStatement(query);
				
				
		//Step-4 : Execute Query
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData data=rs.getMetaData();// To view the data about the table the use of metadata.
		System.out.println(data.getColumnCount());//Column Count
		for(int i=1;i<=data.getColumnCount();i++) {
			System.out.print(data.getColumnName(i)+" ");//Column Name
		}
		System.out.println("");
	    while(rs.next()) {
		System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getFloat("salary"));
		}
				
		//Step-5 : Close
	    rs.close();
	    ps.close();
		con.close();

	}

}
