import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcBatch {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studemo","root","admin123");
		Scanner sc=new Scanner(System.in); 
		String sql="insert into studetail values(?,?,?)";
	    PreparedStatement ps=con.prepareStatement(sql);
	    String msg="";
	    do
	      {
	    	  System.out.println("Enter student id, student name, student dep");
	    	  ps.setInt(1,sc.nextInt());
	    	  ps.setString(2,sc.next());
	    	  ps.setString(3, sc.next());
	      
	    	  ps.addBatch();
	    	  
	    	  System.out.println("Do you want to continue[yes/no]");
	    	  msg=sc.next();
	    	  }while(msg.equals("yes"));
	      
	      ps.executeBatch();
	      
	      System.out.println("All records are inserted");
	      
	      ps.close();
	      con.close();
	      
	}

}
