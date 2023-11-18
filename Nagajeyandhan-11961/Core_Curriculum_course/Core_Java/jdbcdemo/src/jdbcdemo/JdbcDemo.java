package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "admin123";
		int id = 0;
		String name ="";
		int salary = 0;
		String msg = "";
		String query = "";
		int row = 0;
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1)Select 2)Insert 3)Update 4)Delete 5)Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				
				query = "select * from tbl_employee";
				ResultSet rs = st.executeQuery(query);
				System.out.println(query);
//				rs.next(); //move to next record
//				System.out.println("Id is "+rs.getInt(1)); // column number (sql database)
//				System.out.println("Name is "+rs.getString(2));
//				System.out.println("Salary is "+rs.getInt(3));
				
				while(rs.next()) {
					System.out.println("Id is "+rs.getInt(1)); // column number (sql database)
					System.out.println("Name is "+rs.getString(2));
					System.out.println("Salary is "+rs.getInt(3));
				}
				break;
			
			case 2:
		
				
				System.out.println("Enter id:");
				id = sc.nextInt();
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter salary: ");
				salary = sc.nextInt();
				
//				String query = "insert into tbl_employee values(" +id+ ",'" +name+ "'," + salary+");";
//				String query = "insert into tbl_employee values(4,'Dom',25000)";
//				System.out.println(query);
				query = "insert into tbl_employee values(?,?,?);";
								
			//	Statement st = con.createStatement();
//				int row  = st.executeUpdate(query);
				
				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setInt(3, salary);
				
				row = pst.executeUpdate();
				
				System.out.println("Number of rows affected " +row);
								
				break;
				
			case 3:
				
				
				System.out.println("Enter id:");
				id = sc.nextInt();
				
				System.out.println("Enter salary: ");
				salary = sc.nextInt();
				
				query = "update tbl_employee set salary = " +salary+" where emp_id = "+id+"" ;
				
//				System.out.println(query);
								
				row = st.executeUpdate(query);
								
				System.out.println("Number of rows affected " +row);
							
				break;
				
			case 4:
				
				System.out.println("Enter id:");
				id = sc.nextInt();
				
				query = "delete from tbl_employee where emp_id = " +id ;
				
//				System.out.println(query);
								
				row = st.executeUpdate(query);
								
				System.out.println("Number of rows affected " +row);
								
				break;
			
			case 5:
				
				System.exit(0);
				break;

			default:
				System.out.println("Please choose a valid option from[1-5]");
				break;
			}
			
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		}while(msg.equalsIgnoreCase("Yes"));
		con.close();
		}
	}
