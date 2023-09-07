package com.domnic.oopsday3;

class Person1 {
	void displayName() {
		System.out.println("Name is Domnic ");
	}

}

class Employee1 extends Person1 {
	void displaySalary() {
		System.out.println("Salary is 1000");
	}
}

class Student extends Person1{
	void displayRollno() {
		System.out.println("My Rollno is 11964");
	}
}

public class Inherit3 {

	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		Student obj1=new Student(); 
		obj.displayName();
		obj.displaySalary();
		obj1.displayRollno();
	}

}
