package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
//		Step-1 Register or load the driver
//		Class.forName("com.mysql.jdbc.Driver.class");
		
//		Step -2 Making connection with Database
		
		String url ="jdbc:mysql://localhost:3306/studentdetails";
		String userName ="root";
		String password = "Password@12345";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		String sql = "Insert into tbl_employee values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		String msg="";
		do {
			System.out.println("Enter the Emp id,name,salary and department no");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setInt(3, sc.nextInt());
			ps.setInt(4, sc.nextInt());
			
			ps.addBatch();
			
			System.out.println("Do you want to continue : [yes] or [no]");
			msg = sc.next();
		}while(msg.equals("yes"));

		ps.executeBatch();
		
		System.out.println("All records inserted Successfully");
	}

}
