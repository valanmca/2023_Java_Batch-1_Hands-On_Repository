package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExeQuery {

	public static void main(String[] args) throws SQLException {

		//Step : 1 
		
		//Step : 2 Making connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Password@12345");
		
		//Step 3: Creating statement
		String query="Select * from Student";
		PreparedStatement ps=con.prepareStatement(query);
		
		//Step 4 : Execute the query
		
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
		ps.close();
		rs.close();
		
	}

}
