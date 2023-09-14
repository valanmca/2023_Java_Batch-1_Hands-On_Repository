/********* Example for Inheritance Using Person Class... ********/
package com.sara.day10;

class Person {
	void displayName() {
		System.out.println("Name is Sara");
	}
}

class Employee extends Person {
	void displaySalary() {
		System.out.println("Salary is 8537.00");
	}
}

public class Inheritance_Ex02 {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.displayName();
		emp.displaySalary();

	}

}
