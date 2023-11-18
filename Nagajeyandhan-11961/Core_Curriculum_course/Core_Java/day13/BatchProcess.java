package com.jeyandhan.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcess {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String msg = "";
		Scanner sc = new Scanner(System.in);
		//step 1 Register or Loading the driver
		
				Class.forName("com.mysql.jdbc.Driver");
				
				//step 2 Create a connection
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "admin123");
				
				//step 4 Create Statement
				String query  = "insert into student values(?, ?, ?)";
				
				PreparedStatement pst = con.prepareStatement(query);
				
				do {
					System.out.println("Enter the id: ");
					pst.setInt(1, sc.nextInt());
					System.out.println("Enter the Name: ");
					pst.setString(2, sc.next());
					System.out.println("Enter the Department: ");
					pst.setString(3, sc.next());
					System.out.println("Do you want to continue [Yes | No]");
					
					pst.addBatch();
					
					msg = sc.next();
				}while(msg.equalsIgnoreCase("Yes"));
				
				
				//step 4 Execute the query
				
				pst.executeBatch();
				
				System.out.println("Al1 records inserted");
				
				//step 5 close the connection
				
				pst.close();
				con.close();
	}

}
