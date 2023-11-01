package com.ems.main;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
import java.sql.ResultSet;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
import java.util.List;

public class EMSClass {
	static Scanner sc = new Scanner(System.in);
public static int displayMenu() {
		System.out.println("1.Insert \n2.Delete \n3.Update \n4.Find \n5.Find All \n6.Exit");
		System.out.println("Enter Your Choose");
		int Choose = sc.nextInt();
		return Choose;
		// Instance for the return sc.nextInt();
	}

	public static Employee insertEmployee() {
		System.out.println("Enter employee id , employee name , employee department");
		/*
		 * Employee emp = new Employee(sc.nextInt() , sc.next(), sc.next()); return emp;
		 */
		return new Employee(sc.nextInt(), sc.next(), sc.next());
	}

	public static int deleteEmployee() {
		System.out.println("Enter the employee id for delete");
		return sc.nextInt();
	}

	public static Employee updateEmployee() {
		System.out.println("Enter the employee id for update");
		return new Employee(sc.nextInt(), sc.next(), sc.next());
	}

	public static int findEmployee() {
		System.out.println("Enter the employee id for find");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		String msg = "";
		do {
			// int choose = displayMenu();
			// switch(choose) { }
			switch (displayMenu()) {
			case 1:
				/*
				 * Employee emp = insertEmployee(); int n = dao.insertEmployee(emp);
				 */
				if (dao.insertEmployee(insertEmployee()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
			case 2:
				// int student_id = deleteEmployee();
				// dao.deleteEmployee(deleteEmployee());
				int student_id = deleteEmployee();
				int n = dao.deleteEmployee(student_id);
				if (n == 1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record Not Deleted");
				break;
			case 3:
				Employee emp = updateEmployee();
				int ns = dao.updateEmployee(emp);
				if (ns == 1)
					System.out.println("Record Updated");
				else
					System.out.println("Record Not Updated");
				break;
			case 4:
				int id1 = findEmployee();
				Employee bean = dao.findEmployee(id1);
				if (bean != null)
					bean.display();
				else
					System.out.println("Record Not Found");
				break;
			case 5:
				List<Employee> list = dao.findAllEmployee();
				for (Employee e : list)
					e.display();
				break;
			case 6:
				System.out.println("Exist");
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue [Yes | No] ");
			msg = sc.next();
		} while (msg.equals("Yes"));
		if (msg.equals("No")) {
			System.out.println("Exist");
		} else {

		}
	}
}
