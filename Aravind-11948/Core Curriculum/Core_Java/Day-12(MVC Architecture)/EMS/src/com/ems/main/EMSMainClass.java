package com.ems.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.ems.bean.*;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() // views
	{
		System.out.println("1.Insert  2.Delete  3.Update  4.Find  5.Find All 6.Exit");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();

		return choice;
	}

	public static Employee insertEmployee() { // creating new employee object and returning
		System.out.println("Enter employee id,name,salary  and dno");

//		 Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
//		  return emp;
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt()); // code reduction
	}

	public static int deleteEmployee() {
		System.out.println("enter the Employee id");
		return sc.nextInt();
	}

	public static Employee updateEmployee() {

		System.out.println("Enter employee id,name,salary  and dno");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

	}

	public static int findEmployee() {
		System.out.println("Enter employee id to find :");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();

		String msg = "";
		do {
			switch (displayMenu()) {
			case 1:

//				Employee emp=insertEmployee();
//				 int n=dao.insertEmployee(emp);

				if (dao.insertEmployee(insertEmployee()) == 1) {
					System.out.println("Record Inserted");

				} else {
					System.out.println("Record Not Inserted");
				}

				break;

			case 2:
				int id = deleteEmployee();
				int m = dao.deleteEmployee(id);

				if (m == 1) {
					System.out.println("Record Deleted");

				} else {
					System.out.println("Record Not Deleted");
				}

				break;

			case 3:

//				Employee emp=updateEmployee();
//				
//				dao.updateEmployee(emp);

				if (dao.updateEmployee(updateEmployee()) == 1) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Record Not updated");
				}

				break;

			case 4:
// id vangiyachu

				// connection panniyachu
//				int id1=findEmployee();
//				dao.findEmployee(id1);

				Employee bean = dao.findEmployee1(findEmployee());
				if (bean != null) {
					bean.display();
				}

				else {
					System.out.println("Record not Found");
				}

				break;

			case 5:

				ArrayList<Employee> list = dao.findAllEmployee1();

				if (list.isEmpty())

				{
					System.out.println("Table is empty");
				} else {

					for (Employee e : list) {
						e.display();
					}
				}

				break;

			case 6:

				System.exit(0);
				break;

			}
			System.out.println("Do you want to continue [Yes]||[No]");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("yes"));

	}

}
