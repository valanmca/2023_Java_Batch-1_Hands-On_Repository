package com.domnic.oopsday3;
//Single level inheritance
class Person {
	void displayName() {
		System.out.println("Name is Domnic ");
	}

}

class Employee extends Person {
	void displaySalary() {
		System.out.println("Salary is 1000");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.displayName();
		obj.displaySalary();
	}

}
