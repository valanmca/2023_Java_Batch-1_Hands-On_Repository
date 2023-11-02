package jdbcdemo;
import java.sql.*;

public class student {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/Student";
		String userName="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url, userName, password);
//		Statement st=con.createStatement();
		
		
		///-----select 
		
//		String query="select * from tbl_studentdetail";
//		ResultSet rs =st.executeQuery(query);
		
//		while (rs.next())
//		{
//			
//		
//		
//		System.out.println("Id  ="+rs.getInt(1));
//		System.out.println("Name= "+rs.getString(2));
//		System.out.println("Dep ="+rs.getString(3));
//		System.out.println("-----");
//		
//		}
		
		//---------------insert-----
		
//		String query="Insert into tbl_studentdetail values(3,'jeban','C-Sec')";
//		
//		int row =st.executeUpdate(query);
//		System.out.println("Number of Row Affected="+row);
//		
		///---Insert way-2 ---
		
		
//		String query1="Insert into tbl_studentdetail values(?,?,?)";
//		
//		PreparedStatement pst=con.prepareStatement(query1);
//		
//		
//		pst.setInt  (1,6);
//		pst.setString(2,"kumar");
//		pst.setString(3,"d-sec");
//		int row1 =pst.executeUpdate();
//		
//		System.out.println("Number of Row Affected="+row1);
		
		
                             //-----update 
		
//		Statement st1=con.createStatement();
//		
//		String que=" update tbl_studentdetail set stu_name='Aravindsabjai' where id=1" ;
//		
//		int row=st1.executeUpdate(que);
//		
//		System.out.println("Number of rows affected"+row);
		
Statement st1=con.createStatement();
		
		String que=" Delete from  tbl_studentdetail  where id=1" ;
		
		int row=st1.executeUpdate(que);
		
		System.out.println("Number of rows affected"+row);
		
		

	}

}
