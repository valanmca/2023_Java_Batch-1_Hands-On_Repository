package com.purushoth.day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcBatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Step-1 : Register or Loading the driver 
		//Class.forName("com.mysql.jdbc.Driver");
				
		//Step-2 : Making Connection with Database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "root");
        
		String query="insert into sample values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		String msg="";
		
		do {
			System.out.println("Enter id: ");
			ps.setInt(1, sc.nextInt());
			System.out.println("Enter name: ");
			ps.setString(2, br.readLine());
			System.out.println("Enter salary: ");
			ps.setFloat(3, sc.nextFloat());
			
			ps.addBatch();
			
			System.out.println("Do you want to continue [yes] or [no]");
			msg=sc.next();
			}while(msg.equalsIgnoreCase("Yes"));
		
		ps.executeBatch();
		
		System.out.println("All records are added");
		
		//Step-5: Closing
		ps.close();
		con.close();
	}

}
