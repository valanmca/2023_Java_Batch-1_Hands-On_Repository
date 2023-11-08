package com.ems.main;

import java.util.List;
import java.util.Scanner;
import com.ems.bean.Employee; //Importing the Employee class from the com.ems.bean package which was created by us.
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1. Insert 2. Delete 3. Update 4. Find 5. Find All 6.Exit");
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt(); //
		return choice; // return sc.nextInt(); (combination of the above line)
	}

	public static Employee insertEmployee() {
		System.out.println("Enter Student id , name, department : ");
		// we want to import the Employee class manually because it is present in
		// different package.
		// Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
		return new Employee(sc.nextInt(), sc.next(), sc.next());
	}

	public static int deleteEmployee() {
		System.out.println("Enter Student id to delete:");
		return sc.nextInt();
	}
	
	public static Employee updateEmployee() {
		System.out.println("Enter Student id , name, department : ");
		// we want to import the Employee class manually because it is present in
		// different package.
		// Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
		return new Employee(sc.nextInt(), sc.next(), sc.next());
	}
	
	public static int findEmployee() {
		System.out.println("Enter Student id to Find:");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();

		String msg = "";
		do {

			switch (displayMenu()) { // passing the method into the switch case insteadof the variable
			case 1:
				Employee emp = insertEmployee();
				int n = dao.insertEmployee(emp);
				if (n == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
			case 2:
				int id = deleteEmployee();
				int n1 = dao.deleteEmployee(id);
				if (n1 == 1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record Not Deleted");
				break;
			case 3:
				Employee emp1=updateEmployee();
				int n2=dao.updateEmployee(emp1);
				
				if (n2 == 1)
					System.out.println("Record Updated");
				else
					System.out.println("Record Not Updated");
				break;
			case 4:
				int id1 = findEmployee();
				Employee emp2 = dao.findEmployee(id1);
				if(emp2 == null)
					System.out.println("Record Not Found");
				else
					emp2.display();
				
				break;
			case 5: 
				List<Employee>list=dao.findAllEmployee();
				for(Employee e : list)
					e.display();
				break;
			}

			System.out.println("Do You Want to Continue [Yes | No]:");
			msg = sc.next();
		} while (msg.equals("Yes"));

	}

}
