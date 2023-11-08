package jdbcdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSetMetaData;

//getting data from the table.

public class MainClass1 {

	public static void main(String[] args) throws SQLException {
//		Step-1 Register or load the driver
//		Class.forName("com.mysql.jdbc.Driver.class");
		
//		Step -2 Making connection with Database
		
		String url ="jdbc:mysql://localhost:3306/studentdetails";
		String userName ="root";
		String password = "Password@12345";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		DatabaseMetaData data1 = con.getMetaData();
		
		System.out.println(data1.getSQLKeywords());
		
		System.out.println(data1.getURL());
	
		System.out.println(data1.getUserName());
		System.out.println();
		
//		Step-3 Creating statement
		String sql = "select * from tbl_employee";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
//		Step-4 Executing the query
		
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("eName")+" "+rs.getInt("eSalary")+" "+rs.getInt("DepNo"));
			
		}
		
//		Using ResultSetMetaData
		
		ResultSetMetaData data = rs.getMetaData();
		System.out.println(data.getColumnCount());
		
		for(int i=1;i<=data.getColumnCount();i++) {
			System.out.println(data.getColumnName(i)+" ");
		}
		System.out.println();
		
		
		
		
//		Step-5 Closing
		rs.close();
		ps.close();
		con.close();


	}

}
