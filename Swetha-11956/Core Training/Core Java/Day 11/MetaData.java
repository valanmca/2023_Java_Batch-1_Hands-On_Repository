package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaData {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Password@12345");

		String query="Select * from Student";
		PreparedStatement ps=con.prepareStatement(query);
		
		ResultSet rs= ps.executeQuery();
		ResultSetMetaData data= rs.getMetaData();
		
		System.out.println(data.getColumnCount());
		for(int i=1;i<=data.getColumnCount();i++) {
			System.out.print(data.getColumnName(i)+" ");
		}
		System.out.println(" ");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		
		con.close();
		ps.close();
		rs.close();
		
	}

}
