package jdbc_day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Prepared {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Step-1 : Register or Loading the Driver
//		Class.forName("com.mysql.jdbc.Driver");

		// Step-2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "admin123");

		// Step-3 : Creating Statement
		String sql = "select * from tbl_student";
		PreparedStatement ps = con.prepareStatement(sql);

		// Step-4 : Execute the query
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("student_id") + " " + rs.getString("stu_name") + " " + rs.getInt("age"));
		}

		// Step-5 : Closing the Connection
		rs.close();
		ps.close();
		con.close();

	}

}
