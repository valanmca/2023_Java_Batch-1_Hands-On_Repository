//JDBC select method for the preparedStatements
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_Example2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
		// Step - 1 : - Register or Loading the Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Step - 2 : - Making Connection with DataBases
		Connection cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		// Step - 3 : - Creating Statements
		String sql = "select * from JDBC";
		PreparedStatement ps = cons.prepareStatement(sql);
//Step - 4 : - Execute the Query
		ResultSet rs1 = ps.executeQuery();
		while (rs1.next()) {
			System.out.println(rs1.getInt("student_id") + " " + rs1.getString("student_name") + " "
					+ rs1.getString("student_department"));
		}
//Step - 5 : - Closeing the Statements
		ps.close();
		cons.close();
		rs1.close();
	}

}