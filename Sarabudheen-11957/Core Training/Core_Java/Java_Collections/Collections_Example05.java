//CRUD Operations for Employee Management System
package com.sara.CoreJava.Day_11;

import java.util.LinkedList;
import java.util.Scanner;

//Creating Employee class
class Employee {
	int empId;
	String empName;
	float empSalary;

//Employee Constructor
	Employee(int empId, String empName, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

//Method to display Employee Details
	void display() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Salary : " + empSalary);
	}
}

public class Collections_Example05 {

	public static void main(String[] args) {

		int empId = 0;
		String empName = "";
		float empSalary = 0.0f;
		boolean flag = false;
		int index = 0;
		LinkedList<Employee> list = new LinkedList<Employee>();
		String msg = "";

		do {
			System.out.println("1.Add Employee \n" + "2.Find Employee \n" + "3.Update Employee \n"
					+ "4.Delete Employee \n" + "5.View Employee \n" + "6.Exit\n");
			System.out.println("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {

			// Case to Add Employee Record
			case 1:
				System.out.println("Enter Employee ID,Name and Salary : ");
				empId = sc.nextInt();
				empName = sc.next();
				empSalary = sc.nextFloat();
				Employee emp = new Employee(empId, empName, empSalary);
				list.add(emp);
				System.out.println("Employee records are added");
				break;

			// Case to Find Employee Record
			case 2:
				System.out.println("Enter an Employee ID : ");
				empId = sc.nextInt();
				flag = false;
				for (Employee e : list) {
					if (e.empId == empId) {
						flag = true;
					}
				}
				System.out.println(list.get(empId));
				if (flag == false)
					System.out.println("Employee not found");
				break;

			// Case to Update Employee Record
			case 3:
				System.out.println("Enter an Employee ID,Name and Salary : ");
				empId = sc.nextInt();
				empName = sc.next();
				empSalary = sc.nextFloat();

				Employee temp = new Employee(empId, empName, empSalary);

				index = 0;

				for (Employee e : list) {
					if (e.empId == empId) {
						list.set(index, temp);
					}
					index++;
				}
				System.out.println("Employee Record Updated.");
				break;

			// Case to Delete Employee Record
			case 4:
				System.out.println("Enter an Employee ID : ");
				empId = sc.nextInt();
				flag = false;
				index = 0;
				for (Employee e : list) {
					if (e.empId == empId) {
						flag = true;
						// Remove
						list.remove(index);
					}
					System.out.println("Employee record deleted");
				}
				if (flag == false) {
					System.out.println("Employee not found");
				}

				break;

			// Case to Display Employee Record
			case 5:
				for (Employee e : list)
					e.display();
				break;

			// Case to Exit
			case 6:
				System.exit(0);
				break;
			}

			System.out.println("Do you want to continue [Yes || No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}
