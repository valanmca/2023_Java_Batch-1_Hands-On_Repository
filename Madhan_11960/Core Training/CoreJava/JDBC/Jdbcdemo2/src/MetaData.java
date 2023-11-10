import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaData {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studemo","root","admin123");
		DatabaseMetaData data1=con.getMetaData();
		System.out.println(data1.getSQLKeywords());
		System.out.println(data1.getURL());
		System.out.println(data1.getUserName());
		
		String sql="Select * from studetail";
	      PreparedStatement ps=con.prepareStatement(sql);
		 ResultSet rs=ps.executeQuery();
	      ResultSetMetaData data=rs.getMetaData();
	      System.out.println(data.getColumnCount());
	      for(int i=1;i<=data.getColumnCount();i++)
	      {
	    	  System.out.print(data.getColumnName(i)+" ");
	      }
	}

}
