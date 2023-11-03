package jdbc_demo_01;

import java.sql.*;

public class Student {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Student";
		String userName = "root";
		String password = "admin123";
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();

		// To Insert
//		String query1 = "insert into tbl_student values(103,'Aravind',21)";
//		int row = st.executeUpdate(query1);----->Multiple times running so the error says this is duplicate key 
//
//		String query2 = "insert into tbl_student values(104,'Purush',21)";
//		int row1 = st.executeUpdate(query2);

//		String query = "insert into student values(?,?,?)";

//		PreparedStatement pst = con.prepareStatement(query);
//		int student_id = 0;
//		String stu_name = "";
//		String age = "";
//
//		pst.setInt(1, student_id);
//		pst.setString(2, stu_name);
//		pst.setString(3, age);

		// To show the datas
//		String query = "select * from tbl_student";

		String query = "update tbl_student set stu_name = 'sankar' where student_id = 101";
		int row = st.executeUpdate(query);

		System.out.println("Number of rows affected " + row);

		String query1 = "delete from tbl_student where student_id = 103 ";
		int row1 = st.executeUpdate(query);

		System.out.println("Number of rows affected " + row1);

//		ResultSet rs = st.executeQuery(query);

//		rs.next();
//		while (rs.next()) {
//			System.out.println("Student Id : " + rs.getInt(1));// Column 1
//			System.out.println("Student Name : " + rs.getString(2));// Column 2
//			System.out.println("Student Age : " + rs.getString(3));// Column 3

//			System.out.println("Error "+rs.getString(0));//java.sql.SQLException: Column Index out of range, 0 < 1.
//			System.out.println("Number of rows affected " + row1);

		System.out.println();

	}
}
