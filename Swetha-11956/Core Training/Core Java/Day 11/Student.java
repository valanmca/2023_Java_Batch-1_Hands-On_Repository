//Execute update
package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Step 1 : load driver
		//Class.forName("com.mysql.jdbc.Driver");
		
		//Step : 2 : MAking connection with database
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Password@12345";
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		//Step : 3 : Creating Statement
		
		String query="Insert into student values(40,'Vasa','ECE')";
		
		PreparedStatement ps= con.prepareStatement(query);
		
		//Step : 4 : Execute the query
		
		int rows=ps.executeUpdate();
		if(rows==1) {
			System.out.println("Records inserted");
		}
		else {
			System.out.println("Records not inserted");
		}
		
		//Step : 5 : closing
		
		con.close();
		ps.close();
		
	}

}
