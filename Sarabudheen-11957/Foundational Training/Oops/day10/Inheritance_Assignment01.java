/****** Creating Member Class and Inherit Employee and Manager classes... ********/
package com.sara.day10;

class Member {
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;

   Member(String name, int age, int phonenumber, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
	}

	void printSalaray() {
		System.out.println("The Salary is : " + salary);
	}
}

class Employee2 extends Member {
	String specialization;
	String department;

	Employee2(String name, int age, int phonenumber, String address, int salary, String specialization,
			String department) {
		super(name, age, phonenumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}

	void display() {
		System.out.println("The Employee Name is : " + name);
		System.out.println("The Employee Age is : " + age);
		System.out.println("The Employee Mobile No is : " + phonenumber);
		System.out.println("The Employee Adress is : " + address);
		System.out.println("The Employee Salary is : " + salary);
		System.out.println("The Employee Specialization is : " + specialization);
		System.out.println("The Employee Department is : " + department);

	}
}

class Manager extends Member {
	String specialization;
	String department;

	Manager(String name, int age, int phonenumber, String address, int salary, String specialization,
			String department) {
		super(name, age, phonenumber, address, salary);

		this.specialization = specialization;
		this.department = department;
	}

	void display() {
		System.out.println("The Manager Name is : " + name);
		System.out.println("The Manager Age is : " + age);
		System.out.println("The Manager Mobile No is : " + phonenumber);
		System.out.println("The Manager Adress is : " + address);
		System.out.println("The Manager Salary is : " + salary);
		System.out.println("The Manager Specialization is : " + specialization);
		System.out.println("The Manager Department is : " + department);

	}

}

public class Inheritance_Assignment01 {

	public static void main(String[] args) {
		Employee2 emp = new Employee2("Sara", 21, 987652222, "xxxx", 10000, "Employee", "Development");
		emp.display();

		System.out.println(" ");

		Manager obj = new Manager("Jaban", 24, 987652687, "xxxx", 20000, "Manager", "IT");
		obj.display();
	}

}
