package jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcPraticeNo2 {

	public static void main(String[] args) throws SQLException {
		
//		readRecords();
//		insertRecords();
//		Delete();
//		Update();
//		Commitdemo();
		Batchdemo();

	}
	
	public static void readRecords() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
        
        String query = "Select * from employee";
        Connection con = DriverManager.getConnection(url, UserName, Password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);//executeQuery is used to read the data from the Database 
        
        while(rs.next()) {
        System.out.println("Id is "+rs.getInt(1));
        System.out.println("Name is "+rs.getString(2));
        System.out.println("Salary is "+rs.getInt(3));
        
        }
        
        con.close();
	}
	
	public static void insertRecords() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
        //Type-1
        //Hard Coded Values 
        //String query = "insert into employee values(4,'matthew',25000)";
        
       
        //Type-2
        //using datatype to user enter 
//        int Id =5;
//        String Name = "umapathy";
//        int salary=250000;
//        String query = "insert into employee values("+ Id +",'"+ Name+"'," + salary +");";
        
        
        //type-3
        //Prepared Statement
        int Id =5;
        String Name = "umapathy";
        int salary=250000;
        String query = "insert into employee values(?,?,?)";
        
        Connection con = DriverManager.getConnection(url, UserName, Password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1,Id);
        pst.setString(2,Name);
        pst.setInt(3, salary);
     
        int rows = pst.executeUpdate(query);//used to insert,update,Delete Etc 
        System.out.println("No of rows Affected "+rows);
        con.close();
	}
	
	//Delete Statement 
	
	public static void Delete() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
        
        int id = 4;
        String query = "delete from employee where id = "+id;
        
        Connection con = DriverManager.getConnection(url, UserName, Password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("No of rows Affected "+rows);
        

        
        con.close();
	}
	
	//Update statement 
	public static void Update() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
  
        String query = "update employee set salary = 150000 where id = 1";
        
        Connection con = DriverManager.getConnection(url, UserName, Password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("No of rows Affected "+rows);
        

        
        con.close();
	}
	
	
	
	//Types of statement
	//Normal Statement
	//Prepare Statement 
	//Callable Statement
	
	//Calling Simple Stored Procedure

	
	
	
	
	
	//Commit Vs AutoCommit 
	public static void Commitdemo() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
  
        String query1 = "update employee set salary = 600000 where id = 1";
        String query2 = "updat employee set salary = 550000 where id = 2";
        
        
        
        Connection con = DriverManager.getConnection(url, UserName, Password);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query1);
        System.out.println("rows Affected "+rows);
        
        int rows2 = st.executeUpdate(query2);
        System.out.println("rows Affected "+rows2);
        
        //commit
        if(rows>0 && rows2>0) {
        	con.commit();
        }
        con.close();
	}
	
	
	//Batch processing 
	
	public static void Batchdemo() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String UserName = "root";
        String Password = "root";
  
        String query1 = "update employee set salary = 600000 where id = 1";
        String query2 = "update employee set salary = 650000 where id = 2";
        String query3 = "updat employee set salary = 750000 where id = 3";
        
        
        Connection con = DriverManager.getConnection(url, UserName, Password);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query3);
        
        int[] res = st.executeBatch();//Int ARRAY 
        for(int i:res) {
        	if(i>0) 
        		continue;
        		else 
        			con.rollback();
        		
        	
        }
        con.commit();
        con.close();
        

	}
	
	
	
	
	
	
	
}
