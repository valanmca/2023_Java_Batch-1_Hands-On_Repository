package jdbc_day_01;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class JDBC_Metadata {

	public static void main(String[] args) throws SQLException {
		// Step-1 : Register or Loading the Driver
//		Class.forName("com.mysql.jdbc.Driver");

		// Step-2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "admin123");

		DatabaseMetaData data1 = con.getMetaData();
		System.out.println(data1.getSQLKeywords());// To display the keywords in SQL
		System.out.println(data1.getURL());// To display the URL
		System.out.println(data1.getUserName());// To display the UserName
		System.out.println();

		// Step-3 : Creating Statement
		String sql = "select * from tbl_student";
		PreparedStatement ps = con.prepareStatement(sql);

		// Step-4 : Execute the query
		ResultSet rs = ps.executeQuery();

		ResultSetMetaData data = rs.getMetaData();
		System.out.println(data.getColumnCount());

		for (int i = 1; i <= data.getColumnCount(); i++) {
			System.out.print(data.getColumnName(i) + " ");
		}
		System.out.println();

		while (rs.next()) {
			System.out.println(rs.getInt("student_id") + " " + rs.getString("stu_name") + " " + rs.getInt("age"));
		}

		// Step-5 : Closing the Connection
		rs.close();
		ps.close();
		con.close();

	}

}
