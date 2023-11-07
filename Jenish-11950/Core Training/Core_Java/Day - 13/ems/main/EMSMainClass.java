package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1. Insert 2. Delete 3. Update 4. Find 5. Find All 6. Exit");
		System.out.println("Enter your choice : ");
		// int choice = sc.nextInt();
		return sc.nextInt();
	}

	public static Employee insertEmployee() {
		System.out.println("Enter employee id, name, salary , dno :");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

	}

	public static int deleteEmployee() {
		System.out.println("Enter employee id to delete :");
		return sc.nextInt();

	}

	public static Employee updateEmployee() {
		System.out.println("Enter employee id, name, salary , dno :");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

	}

	public static int findEmployee() {
		System.out.println("Enter Employee id to Find:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		String msg = "";
		do {
			// int choice = displayMenu();
			switch (displayMenu()) {
			case 1:
//				Employee emp = insertEmployee();
//				int n = dao.insertEmployee(emp);
				if (dao.insertEmployee(insertEmployee()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;

			case 2:
				int id = deleteEmployee();
				int n = dao.deleteEmployee(id);
				if (n == 1) {
					System.out.println("Record Deleted");
				} else {
					System.out.println("Record Not Deleted");
				}
				break;

			case 3:
				Employee emp = updateEmployee();
				int n1 = dao.updateEmployee(emp);
				if (n1 == 1) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Record Not Updated");
				}
				break;

			case 4:
				int id1 = findEmployee();
				Employee emp2 = dao.findEmployee(id1);
				if (emp2 == null)
					System.out.println("Record Not Found");
				else
					emp2.display();

				break;
			case 5:
				List<Employee> list = dao.findAllEmployee();
				for(Employee e : list)
					e.display();
				break;
			}
			System.out.println("Do you want to continue [Yes | No] :");
			msg = sc.next();
		} while (msg.equals("Yes"));

	}
}
