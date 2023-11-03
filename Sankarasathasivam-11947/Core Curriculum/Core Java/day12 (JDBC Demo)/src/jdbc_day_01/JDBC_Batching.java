package jdbc_day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Batching {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		// Step-1 : Register or Loading the Driver
//		Class.forName("com.mysql.jdbc.Driver");

		// Step-2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "admin123");

		String sql = "insert into tbl_student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		String msg = "";
		do {
			System.out.println("Enter Student_id, Student_Name, Age");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setInt(3, sc.nextInt());

			ps.addBatch();

			System.out.println("Do yo want to continue [Yes | No] ");
			msg = sc.next();
		} while (msg.equals("Yes"));

		// Step-4 : Execute the query
		ps.executeBatch();

		System.out.println("All the Records are Inserted");

		// Step-5 : Closing the Connection
		ps.close();
		con.close();
	}

}
