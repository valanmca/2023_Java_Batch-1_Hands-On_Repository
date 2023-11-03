package com.gayathri.day11CollectionandWrapperclass;

import java.util.Scanner;
import java.util.LinkedList;

class Employee {

	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Name  : " + name);
		System.out.println("Id  : " + id);
		System.out.println("Salary  : " + salary);
	}

}

public class P5Objects {

	public static void main(String[] args) {
		int id = 0;
		String name = " ";
		float salary = 0.0f;
		boolean flag = false;
		int index = 0;
		String ch;
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"1.Add Employee\n2.Find Employee\n3.Update Employee\n4.Delete Employee\n5.View all Employee\n6.Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter id: ");
				id = sc.nextInt();
				System.out.println("Enter name : ");
				name = sc.next();
				System.out.println("Enter salary : ");
				salary = sc.nextFloat();
				Employee emp = new Employee(id, name, salary);
				list.add(emp);
				System.out.println("Employee details are added");
				break;
			case 2:
				System.out.println("Enter the employee id to find : ");
				id = sc.nextInt();
				for (Employee e : list) {
					if (e.id == id) {
						flag = true;
						System.out.println("Employee  found");
						e.display();
						break;
					}
				}
				if (flag == false)
					System.out.println("Employee not found");
				break;
			case 3:
				System.out.println("Enter id: ");
				id = sc.nextInt();
				System.out.println("Enter name : ");
				name = sc.next();
				System.out.println("Enter salary : ");
				salary = sc.nextFloat();
				Employee temp = new Employee(id, name, salary);
				for (Employee e : list) {
					if (e.id == id) {
						flag = true;
						list.set(index, temp);
						System.out.println("Employee details updated.");
						break;
					}

				}
				if (flag == false) {
					System.out.println("Employee details not found");
				}
				break;
			case 4:
				System.out.println("Enter the employee id to delete : ");
				id = sc.nextInt();

				for (Employee e : list) {
					if (e.id == id) {
						flag = true;
						list.remove(index); // remove
						System.out.println("Employee details removed");
						// e.display();
						break;
					}
					index++;

				}
				if (flag == false)
					System.out.println("Employee details not found");
				break;
			case 5:
				for (Employee e : list) {
					e.display();
				}
				break;
			case 6:
				System.out.println("Program End");
				System.exit(0);
				break;
			}
			System.out.print("\nDo you want to continue ? (s or no) : ");
			ch = sc.next();
		} while (ch.equals("s"));

	}

}
