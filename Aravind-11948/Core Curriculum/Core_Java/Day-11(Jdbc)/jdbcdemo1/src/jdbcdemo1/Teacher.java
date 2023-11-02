package jdbcdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String userName="root";
		String Password="root";
		String msg="";
		int choice ;
		String sql;
		int id;
		String name;
		String subject;
		
		Scanner sc=new Scanner (System.in);
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		Connection con=DriverManager.getConnection(url, userName, Password);
		PreparedStatement pt;
		ResultSet rs;
		
		do {
			System.out.println("1 Select 2 Insert 3 Update 4 Delete ");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				 sql="Select * from teacher";
				 pt=con.prepareStatement(sql);
				
				
				 rs=pt.executeQuery();
				ResultSetMetaData data=rs.getMetaData();
				System.out.println("-------------------------------");
				for(int i=1;i<=data.getColumnCount();i++)
				{
					System.out.print(data.getColumnName(i)+"   |   ");
				}
				System.out.println();
				System.out.println("-------------------------------");
				
				
				while(rs.next())
				{
					System.out.println(rs.getInt("id")+"       "+rs.getString ("name")+"       "+rs.getString ("subject")+"       ");
					
				}
				System.out.println("-------------------------------");
				
				
				
				break;
				
			case 2:
				 sql="insert into teacher values(?,?,?)";
				 pt=con.prepareStatement(sql);
				 System.out.println("Enter Id = ");
				 pt.setInt(1,sc.nextInt());
				 System.out.println("Enter name = ");
				 pt.setString(2,input.readLine());
				 System.out.println("Enter subject = ");
				 pt.setString(3,input.readLine());
				
				
				 int row=pt.executeUpdate();
				 
				break;
				
				
			case 3:
				id=sc.nextInt();
				name=input.readLine();
				subject=input.readLine();
				sql="update teacher set name ='" +name+ "',subject='" +subject +"' where id="+id;
				pt=con.prepareStatement(sql);
				
			    row = pt.executeUpdate();
				if (row==1)
				{
					System.out.println("Record updated");
				}
				else
				{
					System.out.println("Record not updated");
				}
				 
				 break;
				
			case 4:
				
				System.out.println("enter id to delete ");
				id=sc.nextInt();
				
			    String query1=" Delete  from teacher where id="+id;
				
				PreparedStatement pr=con.prepareStatement(query1);
				
				
				
				
				
				int n=pr.executeUpdate();
				if(n==1)
				{
					System.out.println("Delete Sucessfully");
				}
				else
				{
					System.out.println("failed");
				}
				
				
				
				break;
				
				
			case 5:
				break;
			}
			
			
		System.out.println("Do you want to continue [yes]||[No]");
		
		msg=input.readLine();
		}while( msg.equalsIgnoreCase("yes"));

	}

}
