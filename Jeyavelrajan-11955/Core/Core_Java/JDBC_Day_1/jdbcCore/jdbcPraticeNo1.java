package jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPraticeNo1 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
        
        String query = "Select * from employee";
        Connection con = DriverManager.getConnection(url, UserName, Password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()) {
        System.out.println("Id is "+rs.getInt(1));
        System.out.println("Name is "+rs.getString(2));
        System.out.println("Salary is "+rs.getInt(3));
        
        }
        
        con.close();
        

	}

}
