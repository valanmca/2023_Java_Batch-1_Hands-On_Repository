package com.naveen.day10;

//Hierarchical Inheritance...
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

	int printSalary() {
		return salary;
	}
}

class Employee2 extends Member {
	String specialization, department;

	Employee2(String specialization, String department, String name, int age, int phone, String address, int salary) {
		super(name, age, phone, address, salary);
		this.specialization = specialization;
		this.department = department;
	}

	void display() {
		System.out.println("Employee Name : " + name);
		System.out.println("Employee age : " + age);
		System.out.println("Employee phone no : " + phone);
		System.out.println("Employee address : " + address);
		System.out.println("Employee salary : " + printSalary());
		System.out.println("Employee Specialization : " + specialization);
		System.out.println("Employee Department : " + department);
	}

}

class Manager extends Member {

	String specialization, department;

	Manager(String specialization, String department, String name, int age, int phone, String address, int salary) {
		super(name, age, phone, address, salary);
		this.specialization = specialization;
		this.department = department;
	}

	void display() {
		System.out.println();
		System.out.println("Manager Name : " + name);
		System.out.println("Manager age : " + age);
		System.out.println("Manager phone no : " + phone);
		System.out.println("Manager address : " + address);
		System.out.println("Manager salary : " + printSalary());
		System.out.println("Manager Specialization : " + specialization);
		System.out.println("Manager Department : " + department);
	}
}

public class InheritanceEx05 {

	public static void main(String[] args) {
		Employee2 obj = new Employee2("Java", "IT", "Naveen", 21, 790422, "vellore", 5000);
		obj.display();

		Manager obj1 = new Manager("Python", "CSE", "Arun", 21, 790422, "vellore", 10000);
		obj1.display();
	}

}
