package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcess {

	public static void main(String[] args) throws SQLException {

		 // Step -2 : Making Connection with database
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Password@12345");
		
		// creating statement
		  String sql = "insert into student_details values (?,?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        String msg = "";
	        Scanner sc = new Scanner(System.in);
	        
	     // Step - 4 : Execute the Query
	        do {
	            System.out.println("Enter Student ID and Student Name : ");
	            ps.setInt(1, sc.nextInt());
	            ps.setString(2, sc.next());
	            
	            ps.addBatch();
	            
	            System.out.println("Do you want to continue [ Yes || No ]");
	            msg = sc.next();
	        }while (msg.equalsIgnoreCase("yes"));
	        
	        ps.executeBatch();
	        
	        // Step-5 : Closing
	        ps.close();
	        con.close();

	        
	}

}
