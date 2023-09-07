package com.naveen.day10;

// Single Level Inheritance
class Person {
	void displayName() {
		System.out.println("Naveenraj");
	}
}

class Employee extends Person {
	void displaySalary() {
		System.out.println("The Salary is : 5000");
	}
}

public class InheritanceEx02 {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.displayName();
		obj.displaySalary();

	}

}
