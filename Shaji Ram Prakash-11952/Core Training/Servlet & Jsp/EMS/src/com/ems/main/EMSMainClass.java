package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.Find All 6.Exit");
		System.out.println("Enter your Choice : ");
		return sc.nextInt();
	}

	public static Employee insertEmployee() {
		System.out.println("Enter Employee Id, Name, Salary and DeptNo : ");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

	}

	public static int deleteEmployee() {
		System.out.println("Enter Employee Id to delete : ");
		return sc.nextInt();

	}

	public static Employee updateEmployee() {
		System.out.println("Enter Employee Id, Name, Salary and DeptNo : ");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

	}

	public static int findEmployee() {
		System.out.println("Enter Employee Id to Find : ");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		String msg = "";
		do {

			switch (displayMenu()) {
			case 1: 
				if (dao.insertEmployee(insertEmployee()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record not Inserted");
				break;
			case 2:
				int Id = deleteEmployee();
				int n = dao.deleteEmployee(Id);
				if (n == 1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record not Deleted");
				break;

			case 3:
				Employee emp = updateEmployee();
				int n1 = dao.updateEmployee(emp);
				if (n1 == 1)
					System.out.println("Record Updated");
				else
					System.out.println("Record not Updated");
				break;

			case 4:
				int Id1 = findEmployee();
				Employee bean = dao.findEmployee(Id1);
				if (bean != null) {
					bean.display();
					System.out.println("Record Found");
				} else
					System.out.println("Record not Found");
				break;

			case 5:
				List<Employee> list = dao.findAllEmployee();
				for (Employee e : list) {
					e.display();
				}
				break;

			case 6:
				System.err.println("\t---");
				System.exit(0);
				break;

			default:
					System.err.println("\t---");
					System.exit(0);
			}

			System.out.println("Do you want to continue [Yes | No] : ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
