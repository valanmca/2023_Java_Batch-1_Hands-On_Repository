package com.jeyavel.coreDay9;

import java.util.LinkedList;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	float salary;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}
}

public class CollectionsEx5 {

	public static void main(String[] args) {
		int id = 0;
		String name = "";
		float salary = 0.0f;

		int index = 0;
		String msg;
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		//do while 
		do {
			System.out.println(
					"1.Add Employee,2.Find Employee 3.Update Employee 4.Delete Employee 5.View All Employee ,6.Exit");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();

		//Switch Case	
			switch (choice) {
			case 1:
				System.out.println("Enter Employee Id , name and salary");
				id = sc.nextInt();
				name = sc.next();
				salary = sc.nextFloat();
				Employee emp1 = new Employee(id, name, salary);
				list.add(emp1);
				System.out.println("Details are Added");
				break;
			case 2:
				System.out.println("Enter the employee id to find");
				id = sc.nextInt();
				boolean flag = false;
				for (Employee e : list) {
					if (e.id == id) {
						flag = true;
						e.display();
					}
				}
				break;
			case 3:
				System.out.println("Enter Employee Id , name and salary to Update ");
				id = sc.nextInt();
				name = sc.next();
				salary = sc.nextFloat();
				Employee emp = new Employee(id, name, salary);
				boolean flag1 = false;
				Employee temp = null;

				for (Employee e : list) {
					if (e.id == id) {
						flag1 = true;
						list.set(index, temp);
						System.out.println("Employee details are updated");
					}
				}
				break;
			case 4:
				System.out.println("Enter the employee id to Delete");
				id = sc.nextInt();
				boolean flag2 = false;
				int index1 = 0;

				for (Employee e : list) {
					if (e.id == id) {
						flag2 = true;
						// Remove
						list.remove(index1);
						System.out.println("Employee Details are Removed");
						break;

					}
					index1++;
				}
				if (flag2 == false) {
					System.out.println("Employee Not Found");
				}
				break;
			case 5:
				for (Employee e : list) {
					e.display();
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue [Yes | No ]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}
}
