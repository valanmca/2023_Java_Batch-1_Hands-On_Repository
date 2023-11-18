package com.purushoth.day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DoctorDb {

	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		String msg="";
		int dtr_Id=0;
		String dtr_Name="";
		String dtr_Specialist="";
		Float dtr_Salary=0.0f;
		String query="";
		int row=0;
		do {
		System.out.println("1.Insert Doctor details \n2.Update Doctor details \n3.Delete Doctor details"
				+ "\n4.View Doctor details");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			//To add
			query="insert into doctorDb values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			String msg1="";
			do {
			System.out.println("Enter Doctor Id: ");
			ps.setInt(1, sc.nextInt());
			System.out.println("Enter Doctor Name: ");
			ps.setString(2, br.readLine());
			System.out.println("Enter Doctor Specialization: ");
			ps.setString(3, br.readLine());
			System.out.println("Enter Doctor Salary: ");
			ps.setFloat(4, sc.nextFloat());
			ps.addBatch();
			
			System.out.println("Do you want to add another then give [yes] do need give [no]");
			msg1=sc.next();
		} while(msg1.equalsIgnoreCase("yes"));
			ps.executeBatch();
			System.out.println("All records are added");
			break;
		
		case 2:
			//To Update
			int no=0;
			System.out.println("To Update Name enter 1 or update specialization enter 2 or update salary"
					+ "enter 3 : ");
			no=sc.nextInt();
			if(no==1) {
				System.out.println("Enter Doctor Id: ");
				dtr_Id=sc.nextInt();
				System.out.println("Enter Doctor Name: ");
				dtr_Name=br.readLine();
				query="update doctorDb set dtr_Name='"+dtr_Name+"' where dtr_Id="+dtr_Id+"";
				PreparedStatement ps1=con.prepareStatement(query);
				row=ps1.executeUpdate();
				System.out.println("Updated Successfully");
			} if(no==2) {
				System.out.println("Enter Doctor Id: ");
				dtr_Id=sc.nextInt();
				System.out.println("Enter Doctor Specialization: ");
				dtr_Specialist=br.readLine();
				query="update doctorDb set dtr_Specialist='"+dtr_Specialist+"' where dtr_Id="+dtr_Id+"";
				PreparedStatement ps1=con.prepareStatement(query);
				row=ps1.executeUpdate();
				System.out.println("Updated Successfully");
			} if(no==3) {
				System.out.println("Enter Doctor Id: ");
				dtr_Id=sc.nextInt();
				System.out.println("Enter Doctor Salary: ");
				dtr_Salary=sc.nextFloat();
				query="update doctorDb set dtr_Salary="+dtr_Salary+" where dtr_Id="+dtr_Id+"";
				PreparedStatement ps1=con.prepareStatement(query);
				row=ps1.executeUpdate();
				System.out.println("Updated Successfully");
			}
			
			break;
		
		case 3:
			//To delete
			System.out.println("Enter the Doctor Id: ");
			dtr_Id=sc.nextInt();
			query="delete from doctorDb where dtr__Id="+dtr_Id;
			PreparedStatement ps3=con.prepareStatement(query);
			row=ps3.executeUpdate();
			System.out.println("Doctor details Deleted");
			break;
		
		case 4:
			//To view
			query="select * from doctorDb"; 
			PreparedStatement ps4=con.prepareStatement(query);
			ResultSet rs=ps4.executeQuery();
		    while(rs.next()) {
			System.out.println(rs.getInt("dtr_Id")+" "+rs.getString("dtr_Name")+" "+rs.getString("dtr_Specialist")+" "+rs.getFloat("dtr_Salary"));
			}
		
		
			
			
			
			
		}
		
		System.out.println("Do you want to continue [yes] or [no]");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("yes"));
		

	}

}
