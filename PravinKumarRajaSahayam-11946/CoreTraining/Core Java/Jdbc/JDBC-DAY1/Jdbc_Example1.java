//JDBC insert method using the preparedStatements
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_Example1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
		// Step - 1 : - Register or Loading the Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Step - 2 : - Making Connection with DataBases
		Connection cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		// Step - 3 : - Creating Statements
		String sql = "insert into JDBC values(?,?,?)";
		PreparedStatement ps = cons.prepareStatement(sql);
		ps.setInt(1, 1235);
		ps.setString(2, "Pravins");
		ps.setString(3, "Pravins");
//Step - 4 : - Execute the Query
		int r = ps.executeUpdate();
		if (r == 1) {
			System.out.println("Record Inserted");
		} else {
			System.out.println("Record Not Inserted");
		}
//Step - 5 : - Close the Statements
		ps.close();
		cons.close();
	}

}