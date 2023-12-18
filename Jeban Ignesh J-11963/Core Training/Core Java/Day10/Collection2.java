package com.jeban.Day10;

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
		System.out.println("Employee ID:" + id);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Salary:" + salary);
		System.out.println("---------------------------");
	}
}

public class Collection2 {

	public static void main(String[] args) {
		int id = 0;
		String name = " ";
		float salary = 0.0f;
		boolean flag = false;
		int index = 0;
		String msg="";
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		do {

		System.out.println("1.Add Employee,2.Find Employee,3.Update Employee,4.Delete Employee,5.View Employee,6.Exit");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		
		

		switch (choice) {
		case 1:
			System.out.println("Enter Employee id,name and salary");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			System.out.println("Employee Details are Added");
			break;
		case 2:
			System.out.println("Enter the employee id to find");
			id = sc.nextInt();

			for (Employee e : list) {
				if (e.id == id) {
					flag = true;
					e.display();
				}
			}
			if (flag == false) {
				System.out.println("Employee Not Found");
			}
			break;
		case 3:
			System.out.println("Enter Employee id,name and salary");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			Employee temp = new Employee(id, name, salary);
			index = 0;
			flag = false;
			for (Employee e : list) {
				if (e.id == id) {
					flag = true;
					list.set(index, temp);
					System.out.println("Employee Details are Updated");
					break;
				}
				index++;
			}
			if (flag == false) {
				System.out.println("EMployee Not Found");
			}
			break;
		case 4:
			System.out.println("Enter the employee id to find");
			id = sc.nextInt();
			flag = false;
			index = 0;
			for (Employee e : list) {
				if (e.id == id) {
					flag = true;
					list.remove(index);
					System.out.println("Employee Details are Removed");
				}
				index++;
			}
			if (flag == false) {
				System.out.println("Employee Not Found");
			}
			break;

		case 5:
			for (Employee e : list) {
				e.display();
			}
			break;
		case 6:
			System.out.println("System Exit");
			System.exit(0);
			
			break;
		}
		
		System.out.println("Do you want to continue[Yes|No]");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("Yes"));

	}

}
