package jdbcdemo1;

import java.sql.*;

public class StudentDetail {

	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "admin123";
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		
		
//		String query = "update student set sname = 'NagaJeyandhan' where std_id = 1" ;
		String query = "delete from student  where std_id = 1" ;
		int row = st.executeUpdate(query);
		
		System.out.println("Number of rows affected "+row);
		
		
	}
	

}
