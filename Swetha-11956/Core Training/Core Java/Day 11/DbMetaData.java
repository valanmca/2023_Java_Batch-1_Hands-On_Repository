package demo1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbMetaData {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Password@12345");

		DatabaseMetaData db=con.getMetaData();
		System.out.println(db.getSQLKeywords());
		System.out.println(db.getURL());
		System.out.println(db.getUserName());
		
		con.close();
		
		}

}
