/***** Creating Class,Method and Constructors for Employee Class... *****/
package com.sara.day08;

class Employee {

	// Variables
	int eid;
	String ename;
	float esalary;

	// Constructor
	Employee(int eid, String ename, float esalary) {
		System.out.println(" ");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	// Method
	void display() {
		System.out.println("The Employee ID is :" + eid);
		System.out.println("The Employee Name is :" + ename);
		System.out.println("The Employee Salary is :" + esalary);
	}
}

public class Oops_Example1 {

	public static void main(String[] args) {
		// Object Creation and Calling Constructor...
		Employee sara = new Employee(101, "Sara", 3000.0f);

		// Method Calling...
		sara.display();

		Employee gowtham = new Employee(102, "Gowtham", 3500.0f);
		gowtham.display();

	}

}
