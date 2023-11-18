package com.jeyandhan.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 Register or Loading the driver
		
				Class.forName("com.mysql.jdbc.Driver");
				
				//step 2 Create a connection
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "admin123");
				DatabaseMetaData data1 = con.getMetaData(); // information about Database
				System.out.println("Sql Keywords: "+data1.getSQLKeywords());
				System.out.println("URL: "+data1.getURL());
				System.out.println("UserName: "+data1.getUserName());
				//step 4 Create Statement
				String query  = "select * from student";
				
				PreparedStatement pst = con.prepareStatement(query);
				
				
				//step 4 Execute the query
				
				ResultSet rs  = pst.executeQuery();
				ResultSetMetaData data = rs.getMetaData(); // information about Result Set
				
				System.out.println("Number of columns: "+data.getColumnCount()); // 3
				
				for (int i = 1; i <= data.getColumnCount(); i++) {
					System.out.print(data.getColumnName(i)+ " ");
				}
				System.out.println();
				while(rs.next()) {
					System.out.println(rs.getInt("std_id") + " " +  rs.getString("sname") + " " + rs.getString("dept"));
				}
				
				//step 5 close the connection
				rs.close();
				pst.close();
				con.close();
	}

}
