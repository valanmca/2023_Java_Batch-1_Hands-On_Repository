package com.shaji.Day08;

class Employee {
	// variables
	int eid;
	String ename;
	float esalary;

	// constructor
	Employee(int eid, String ename, float esalary) {
		System.out.println("Inside Constructor");
		this.eid = eid; // this keyword refers to current object
		this.ename = ename;
		this.esalary = esalary;
	}

	// method
	void display() {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee salary : " + esalary);
	}
}

public class Employee_Details {

	public static void main(String[] args) {
		// Object creation and calling the Constructor
		Employee shaji = new Employee(101, "Shaji", 16000.0f);
		// Method calling
		shaji.display();
		Employee sara = new Employee(102, "Sara", 16000.0f);
		sara.display();
		Employee the_boss = new Employee(103, "The BOSS", 16000.1f);
		the_boss.display();
	}

}
