package jdbcdemo1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

//import java.sql.*;


public class Mainclass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step-1: Register or Loading the Driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step-2 //making Connection with.Jdbc.Driver
		
		
		String url="jdbc:mysql://localhost:3306/Student";
		String userName="root";
		String password="root";
		
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		DatabaseMetaData data1=con.getMetaData(); //database meta data gives info about  database
		
		System.out.println(data1.getSQLKeywords());
		System.out.println(data1.getSQLStateType());
		System.out.println(data1.getURL());
		System.out.println(data1.getUserName());
		System.out.println(data1.getMaxUserNameLength());
		
		
		
		//  Step-3 create Statement 
		
		
		/// ----insert operation
		
//		String sql="insert into tbl_employee values(?,?,?,?)";
//		
//		PreparedStatement pt=con.prepareStatement(sql);
//		
//		pt.setInt(1, 1);
//		pt.setString(2,"Aravind");
//		pt.setInt(3, 2000);
//		pt.setInt(4,10);
//		
//		// step-4 execute query
//		
//		int n=pt.executeUpdate();
//		
//		if(n==1)
//		{
//			System.out.println("Record inserted");
//		}
//		else
//		{
//			System.out.println("Record not inserted");
//		}
		
//		String sql="select * from tbl_employee ";
//		
//		PreparedStatement pt=con.prepareStatement(sql);
//		
//		ResultSet rs=pt.executeQuery();
//		  ResultSetMetaData data=rs.getMetaData();
//		  
//		  System.out.println(data.getColumnCount());   // get column count 
//		  for(int i=1;i<=data.getColumnCount();i++) 
//		  {
//			  System.out.println( i+" column name="+data.getColumnName(i));
//		  }
////		  System.out.println(data.getColumnName(1)); // get column name 
//		
//		while (rs.next())
//		{
//			System.out.println( "Id = "+rs.getInt("id")+"    Name = "+rs.getString ("name")+"   Salary = "+rs.getInt("salary")+"   Department No = "+rs.getInt("dno")); // way -1 core readability
////			System.out.println(rs.getInt(1)); // way-2
//			
//		}
		
//		//step-5 closing 
//		rs.close();
		
		/// --batch procesing 
		Scanner sc=new Scanner(System.in);
		String  sql="insert into tbl_employee values (?,?,?,?)";
		PreparedStatement pt=con.prepareStatement(sql);
		String msg="";
		do {
			System.out.println(" Enter Employee id,name,Salary,dno");
			pt.setInt(1,sc.nextInt());
			pt.setString(2, sc.next());
			pt.setInt(3,sc.nextInt());
			pt.setInt(4,sc.nextInt());
			
			pt.addBatch();
			
			System.out.println("Do you want to continue [yes]||[no]");
			msg=sc.next();
			
		}while(msg.equalsIgnoreCase("yes"));
		
		pt.executeBatch();
		
		System.out.println("Record Inserted ");
		pt.close();
		con.close();
		
		
		

	}

}
