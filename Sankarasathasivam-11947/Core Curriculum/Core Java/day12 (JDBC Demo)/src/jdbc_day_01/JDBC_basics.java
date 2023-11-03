package jdbc_day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_basics {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step-1 : Register or Loading the Driver
		Class.forName("com.mysql.jdbc.Driver");

		// Step-2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "admin123");

		// Step-3 : Creating Statement
		String sql = "insert into tbl_student values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 106);
		ps.setString(2, "Raghul");
		ps.setInt(3, 23);
		

		// Step-4 : Execute the query
		int n = ps.executeUpdate();
		if (n == 1) {
			System.out.println("Record Inserted");
		} 
		else {
			System.out.println("Record Not Inserted");
		}

		// Step-5 : Closing the Connection
		ps.close();
		con.close();
	}

}
