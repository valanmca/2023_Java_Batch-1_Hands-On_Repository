package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		Step-1 Register or load the driver
//		Class.forName("com.mysql.jdbc.Driver.class");
		
//		Step -2 Making connection with Database
		
		String url ="jdbc:mysql://localhost:3306/studentdetails";
		String userName ="root";
		String password = "Password@12345";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
//		Step-3 Creating statement
		String sql = "Insert into tbl_employee values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 823);
		ps.setString(2, "Matthew");
		ps.setInt(3, 300000);
		ps.setInt(4, 10);
		
//		Step-4 Executing the query
		
		int n = ps.executeUpdate();
		if(n==1) {
			System.out.println("Record Insert");
		}
		else {
			System.out.println("Record not Inserted");
		}
		
		
//		Step-5 Closing
		
		ps.close();
		con.close();
	}

}
