package com.naveen.day9;

import java.util.LinkedList;
import java.util.Scanner;

class Employee{

	// Variables
	int id;
	String name;
	float salary;
	

	// Constructor
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	// Method
	void display() {
		System.out.println("Employee id :" + id);
		System.out.println("Employee name :" + name);
		System.out.println("Employee salary :" + salary);
		System.out.println("----------------------------");

	}
}

public class Ex05_EmployeeManipulation {

	public static void main(String[] args) {
		
		int id =0;
		String name = "";
		float salary = 0.0f;
		boolean flag = false;
		int index =0;
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		
		String msg = "";
		do {
		System.out.println("1.Add Employee 2.Find Employee 3.Update Employee 4.Delete Employee 5.View All Employee 6.Exit");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		
	
		
		switch(choice) {
		case 1:
			System.out.println("Enter Employee id, name and salary :");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			System.out.println("Employee details are added.");
			break;
		
		case 2:
			System.out.println("Enter the Employee id to find :");
			id = sc.nextInt();
			flag = false;
			for(Employee e : list) {
				if(e.id == id) {
					flag = true;
					e.display();
					break;
				}
			}
			if(flag == false)
				System.out.println("Employee not found!");
			break;
			
		case 3:
			System.out.println("Enter Employee id, name and salary :");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			index =0;
			flag = false;
			Employee temp = new Employee(id, name, salary);
			for(Employee e : list) {
				if(e.id == id) {
					flag = true;
					list.set(index, temp);
					System.out.println("Employee details are updated.");
					break;
				}
				index++;
			}
			if(flag == false) {
				System.out.println("Record not found!");
			}
			break;
			
		case 4:
			System.out.println("Enter the Employee id to delete :");
			id = sc.nextInt();
			flag = false;
			index =0;
			for(Employee e : list) {
				if(e.id == id) {
					flag = true;
					//Remove
					list.remove(index);
					System.out.println("Employee details are removed");
					break;
				}
				index++;
			}
			if(flag == false)
				System.out.println("Employee not found!");
			break;
			
		case 5:
			for(Employee e : list)
				e.display();
			break;
			
		case 6:
			System.exit(0);
			break;
		}
		
		System.out.println("Do you want to continue [yes | no]");
		msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));
	}
}
