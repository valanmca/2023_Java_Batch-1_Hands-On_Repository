package jdbcCore;

import java.sql.*;

public class Student {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/Student";
		String userName="root";
		String password="root";
		          //Reference
		Connection con = DriverManager.getConnection(url, userName, password);
		          //Reference 
		Statement st = con.createStatement();
		
		
		//Select query 
//		String query = "select*from tbl_student";
//		ResultSet rs = st.executeQuery(query);
		
		//Type 2
		String query = "insert into student values(?,?,?)";
		
		
		PreparedStatement pst = con.prepareStatement(query);
		
		
//		rs.next();
		
//		while(rs.next()) {
//		                                   //column 
//		System.out.println("Id is"+rs.getInt(1));
//		System.out.println("Id is"+rs.getString(2));
//		System.out.println("Id is"+rs.getString(3));
//		}
		
		
		// Insert Query
//		String query1 = "insert into tbl_student values(103,'harrish','Cs')";
//		int row = st.executeUpdate(query1);
//		System.out.println("Number of Rows Affected"+row);
		
		//update Query
//		String query3 = "Update  tbl_student set studentName  = 'jeyavelrajan' where student_id = 101";
//		int row = st.executeUpdate(query3);
//		
//		System.out.println("No of updated rows "+row);
		
		
		
		
		//Delete
		String query4 = "delete from tbl_student where student_id = 103";
		int row = st.executeUpdate(query4);
		
		System.out.println("No of Deleted Rows"+row);
		
		
		

	}

}
