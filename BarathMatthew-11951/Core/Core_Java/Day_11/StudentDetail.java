package jdbcdemo;

import java.sql.*;

public class StudentDetail {

	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/studentdetails";
		String userName ="root";
		String password = "Password@12345";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		
//		String query = "select * from student";
//		ResultSet rs = st.executeQuery(query);
//		while(rs.next()) {
//		System.out.println("Id is : "+rs.getInt(1));
//		System.out.println("Name is : "+rs.getString(2));
//		System.out.println("dept is : "+rs.getString(3));
//		}
//		String query ="insert into student values(104,'Jeslin','Developer')";
//		int row = st.executeUpdate(query);
//		
//		System.out.println("No of rows affected : "+row);
			
//		PreparedStatement pst = con.prepareStatement(query);
//
//		int std_id;
//		String name = "";
//		int salary;
//		pst.setInt(1, 105);
		
//		update 
		
//		String query = "update student set stuName = 'BarathMatthew' where stuId =102";
//		int row = st.executeUpdate(query);
		
//		System.out.println("No of rows affected : "+row);
		
//		Delete
		
		String query = "delete from student where stuId =102";
		int row = st.executeUpdate(query);
		System.out.println("No of rows affected : "+row);
		
	}

}
