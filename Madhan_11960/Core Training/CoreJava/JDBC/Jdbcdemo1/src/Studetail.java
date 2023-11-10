
import java.sql.*;

public class Studetail {

	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:mysql://localhost:3306/studemo";
		String userName="root";
		String password="admin123";
		Connection con= DriverManager.getConnection(url, userName, password);
		Statement st=con.createStatement();
		
		
//		String query="insert into studetail values(?,?,?)";
		
		
		
//		String query="select * from studetail";
//		ResultSet rs=st.executeQuery(query);
//		
//		while(rs.next()) {
//		System.out.println("Id  :"+rs.getInt(1));
//		System.out.println("Name :"+rs.getString(2));
//		System.out.println("Department :"+rs.getString(3));
//		}
		
		
//		String query="insert into studetail values(3,'Aravind','ECE')";
//		int row=st.executeUpdate(query);
//		
//		System.out.println("Number of rows affected :"+row);
		
//		String query="update studetail set stu_name='Madhan Kumar' where stu_id=1";
		
		String query="delete from  studetail where stu_id=3";
		int row=st.executeUpdate(query);
		
		System.out.println("Number of rows affected :"+row);
		
		}

}
