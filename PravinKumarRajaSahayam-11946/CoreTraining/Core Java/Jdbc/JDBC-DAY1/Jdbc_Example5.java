//JDBC using for the Batch method processings  
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc_Example5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Step - 1 : - Register or Loading the Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Step - 2 : - Making Connection with DataBases
		Connection cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		// Step - 3 : - Creating Statements
		String sql = "insert into JDBC values(?,?,?)";
		PreparedStatement ps = cons.prepareStatement(sql);
		String msg = "";
		do {
			System.out.println("Enter the stident id,name,and,department");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setString(3, sc.next());
			ps.addBatch();
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		} while (msg.equals("Yes"));
//Step - 4 : - Execute the Query
		ps.executeBatch();
		System.out.println("All the records are inserted");
//Step - 5 : - Closeing the Statements
		ps.close();
		cons.close();
	}

}