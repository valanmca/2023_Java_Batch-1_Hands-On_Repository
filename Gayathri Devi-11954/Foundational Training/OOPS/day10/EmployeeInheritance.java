package com.gayathri.day10;

class Human {
	void displayName() {
		System.out.println("Name : Gayathri Devi");
	}
}

class Salary extends Human {
	void displaySalary() {
		System.out.println("Salary : 8537");
	}
}

public class EmployeeInheritance {

	public static void main(String[] args) {
		Salary object = new Salary();
		object.displayName();
		object.displaySalary();

	}
}
