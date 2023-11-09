package jdbcCore;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcCay1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc =new Scanner (System.in);
		
		//Step-1 : Register or Loading the Driver
//		Class.forName("com.mysql.jdbc.Driver.class");
		
		//Step-2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
//		DatabaseMetaData data1 = con.getMetaData();
//		System.out.println(data1.getSQLKeywords());
//		System.out.println(data1.getURL());
//		System.out.println(data1.getUserName());
		
		//Batch processing
      String sql = "Insert into tbl_employee values(?,?,?,?)";  
      PreparedStatement ps = con.prepareStatement(sql);
      String msg = "";
      do {
    	  System.out.println("Enter Employee id,name,salary and depno");
    	  ps.setInt(1, sc.nextInt());
    	  ps.setString(2, sc.next());
    	  ps.setInt(3, sc.nextInt());
    	  ps.setInt(4, sc.nextInt());
    	  
    	  ps.addBatch();
    	  
    	  System.out.println("Do you want to continue [Yes] or [No]");
    	  msg = sc.next();
      }while(msg.equals("Yes"));
      ps.executeBatch();
      System.out.println("All the Records are inserted successfully");
		
		
		
		
		
		
		//Step-3: Creating Statement 
		              //My Sql will compile this 
//        String sql = "Insert into tbl_employee values(?,?,?,?)";  
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1,11955);
//        ps.setString(2, "jeyavel");
//        ps.setInt(3, 13000);
//        ps.setInt(4, 10);
		
		
//		String sql = "Select * from tbl_employee";
//		PreparedStatement ps = con.prepareStatement(sql);
        
        //Step-4: Execute the Querry 
//        int n = ps.executeUpdate();	
//        if(n ==1) {
//        	System.out.println("Record Inserted");
//        }else{
//        	System.out.println("Recors is Not Inserted");
//        }
		
		
		
		
		//Result set metadata and its result 
//		ResultSet rs = ps.executeQuery();
//		ResultSetMetaData data = rs.getMetaData();
//		System.out.println(data.getColumnCount());//4
//		for(int i=1;i<=data.getColumnCount();i++) {
//			System.out.println(data.getColumnName(i)+" ");
//		}
//		System.out.println();
		
		//Select the table and display its values 
//		while(rs.next()) {
//			System.out.println(rs.getInt("Id")+" "+rs.getString("eName")+" "+rs.getInt("eSalary")+" "+rs.getInt("DepNo"));
//		}
        
		
		
		
		
		
		
        
        //Step-5 Closing
//		rs.close();
        ps.close();
        con.close();
        
	}

}
