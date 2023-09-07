package com.gayathri.day10;

class Member {
	String name;
	int age;
	int phone;
	String address;
	int salary;

	Member(String name, int age, int phone, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}

	void printSalary() {
		System.out.println("The salary of the member : " + salary);
	}
}

class Employee extends Member {
	String special;
	String dept;

	/*
	 * public Employee(String name, int age, int phone, String address, int salary)
	 * { super(name, age, phone, address, salary); // TODO Auto-generated
	 * constructor stub }
	 */

	Employee(String name, int age, int phone, String address, int salary, String special, String dept) {
		super(name, age, phone, address, salary);
		this.special = special;
		this.dept = dept;
	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Phone : " + phone);
		System.out.println("Address : " + address);
		System.out.println("Salary : " + salary);
		System.out.println("Special : " + special);
		System.out.println("Department : " + dept);
	}

}

class Manager extends Member {
	String dept;
	String special;

	Manager(String name, int age, int phone, String address, int salary, String special, String dept) {
		super(name, age, phone, address, salary);
		this.special = special;
		this.dept = dept;
	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Phone : " + phone);
		System.out.println("Address : " + address);
		System.out.println("Salary : " + salary);
		System.out.println("Special : " + special);
		System.out.println("Department : " + dept);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Employee emp = new Employee("Gayathri", 22, 1111111111, "SVKS", 50000, "Onnum illa", "IT");
		emp.display();

		Manager mg = new Manager("Gowtham", 33, 222222222, "Chennai", 100000, "Software Trainer", "IT");
		mg.display();
	}

}
