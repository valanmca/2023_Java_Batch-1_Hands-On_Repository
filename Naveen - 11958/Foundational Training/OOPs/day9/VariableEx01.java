package com.naveen.day9;

//Usage of Static Variables in a program.
class Employee {
	// Variables
	static String org = "Relevantz";
	int eid;

	// Constructor
	Employee(int eid) {
		this.eid = eid;
	}

	// Method
	void display() {
		System.out.println("Organization name : " + org);
		System.out.println("Employee id : " + eid);
	}
}

public class VariableEx01 {

	public static void main(String[] args) {
		Employee naveen = new Employee(11958);
		naveen.display();

		Employee pravin = new Employee(11946);
		pravin.display();

	}

}
