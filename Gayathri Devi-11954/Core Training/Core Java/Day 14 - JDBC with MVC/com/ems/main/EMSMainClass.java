package com.ems.main;

import java.util.List;
import java.util.Scanner;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("\n1.Insert\n2.Delete\n3.Update\n4.Find\n5.Find All\n6.Exit\n");
		System.out.println("Enter your choice : ");
		return sc.nextInt(); // - direct read & return

//		int choice = sc.nextInt();
//		return choice;

	}

	public static Employee insertEmployee() {
		System.out.println("Enter student name, id : ");
//		Employee emp = new Employee(sc.next(), sc.nextInt());
//		return emp;
		return new Employee(sc.next(), sc.nextInt()); // single line =>
	}

	public static int deleteEmployee() {
		System.out.print("Enter the student id to delete : ");
		return sc.nextInt();
	}

	public static Employee updateEmployee() {
		System.out.println("Enter student name, id : ");
		return new Employee(sc.next(), sc.nextInt());
	}

	public static int findEmployee() {
		System.out.println("Enter student id : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		String msg = "";
		do {
			switch (displayMenu()) {
			case 1:// insert
					// Employee emp = insertEmployee();
					// int n = dao.insertEmployee(emp);
					// if(n==1)
				if (dao.insertEmployee(insertEmployee()) == 1) // single line
					System.out.println("Record Inserted");
				else
					System.out.println("Record not Inserted");
				break;
			case 2:// delete
					// int sId = deleteEmployee();
					// int n = dao.deleteEmployee(sId);
				if (dao.deleteEmployee(deleteEmployee()) == 1) // single line
					// if(n==1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record not Deleted");
				break;
			case 3:// update
//				Employee emp = updateEmployee();
//				int n1 = dao.updateEmployee(emp);

				if (dao.updateEmployee(updateEmployee()) == 1)
					// if(n1== 1)
					System.out.println("Record Updated");
				else
					System.out.println("Record not Updated");
				break;
			case 4:
				int id1 = findEmployee();
				Employee emp2 = dao.findEmployee(id1);
				if (emp2 == null)
					System.out.println("Record Not Found");
				else {
					System.out.println("Record  Found");
					emp2.display();
				}
				break;
			case 5:
				List <Employee> list = dao.findAllEmployee();
				for(Employee e : list) {
					e.display();
				}
				break;

			case 6:
				System.exit(0);
				break;
			}
			System.out.print("Do you want to continue? [Yes | No] : ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
