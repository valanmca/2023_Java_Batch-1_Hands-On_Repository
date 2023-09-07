/******* Creating Methods and Constructor for Employee Class... *********/
package com.sara.day09;

class Employee {

	// Variables
	static String Org = "RelevantZ";// Static Variable
	int eid;// Instance Variable
	String ename;

	// Constructor
	Employee(int eid, String ename) {
		System.out.println(" ");
		this.eid = eid;
		this.ename = ename;
	}

	// Method
	void display() {
		System.out.println("The Employee's Organisation is :" + Org);
		System.out.println("The Employee ID is :" + eid);
		System.out.println("The Employee Name is :" + ename);

	}
}

public class Oops_Example5 {

	public static void main(String[] args) {
		// Object Creation and Calling Constructor...

		Employee sara = new Employee(101, "Sara");
		sara.display();

		Employee jenis = new Employee(102, "Jenis");
		jenis.display();

	}

}
