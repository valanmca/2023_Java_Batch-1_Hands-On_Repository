import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employeedet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  //Step1:Register or Loading the driver
//      Class.forName("com.mysql.jdbc.Driver");
      
      //Step2:Making Connection with Database
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studemo","root","admin123");
      
      //Step3:Creating Statement
      String sql="insert into studetail values(?,?,?)";
      PreparedStatement ps=con.prepareStatement(sql);
      ps.setInt(1, 456);
      ps.setString(2, "hephzi");
      ps.setString(3, "MCA");
      
      //Step4:Execute the Query
      int n=ps.executeUpdate();
      if(n==1) {
          System.out.println("Record inserted");
      }
      else{
          System.out.println("Not inserted Record");
      }
      //Step5:Close the connection
      ps.close();
      con.close();
	}

}
