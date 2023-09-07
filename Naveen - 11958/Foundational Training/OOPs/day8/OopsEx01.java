//OOps Concepts starts......

package com.naveen.day8;
//Basic Class and Object program.

//Initialize class.
class Employee {

	// Variables
	int eid;
	String ename;
	float esalary;

	// Constructor
	Employee(int eid, String ename, float esalary) {
		System.out.println("Inside Constructor");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;

	}

	// Method
	void display() {
		System.out.println("Employee id :" + eid);
		System.out.println("Employee name :" + ename);
		System.out.println("Employee salary :" + esalary);

	}

}

public class OopsEx01 {

	public static void main(String[] args) {
		// Object Creation and calling the Constructor
		Employee valan = new Employee(101, "Valan", 2000.0f);
		// Method Calling
		valan.display();

		Employee naveen = new Employee(102, "Naveen", 3000.0f);
		naveen.display();
	}

}
