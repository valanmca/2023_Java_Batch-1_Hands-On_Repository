import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studemo","root","admin123");
		
		
		
		String sql="Select * from studetail";
	      PreparedStatement ps=con.prepareStatement(sql);
	      
	      ResultSet rs=ps.executeQuery();
	      ResultSetMetaData data=rs.getMetaData();
	      
	      System.out.println(data.getColumnCount());//3
	      
	      for(int i=1;i<=data.getColumnCount();i++)
	      {
	    	  System.out.print(data.getColumnName(i)+" ");
	      }
	      System.out.println();
	      
	      while(rs.next())
	      {
	    	  System.out.println(rs.getInt("stu_id")+"  "+rs.getString("stu_name")+"  "+rs.getString("stu_dep")+"  ");
	      }
	      
	      rs.close();
	      ps.close();
	}

}
