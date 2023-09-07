//oops basic object creation and method calling
package com.domnic.day8;

class Employee {
	// variables
	int eid;
	String ename;
	float esal;

	// constructors
	Employee(int eid, String ename, float esal) {
		// this keyword refers to current object
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	// methods
	void display() {
		System.out.println("Employee id :" + eid);
		System.out.println("Employee name :" + ename);
		System.out.println("Employee sal :" + esal);
	}

}

public class Oopsbasic {

	public static void main(String[] args) {
		// object creation and calling constructor
		Employee domnic = new Employee(11964, "Domnic", 2000.0f);
		// method calling
		domnic.display();
		System.out.println();
		// object creation and calling constructor
		Employee jeban = new Employee(11963, "Jeban", 2000.0f);
		// method calling
		jeban.display();
		System.out.println();
		// object creation and calling constructor
		Employee muthuraj = new Employee(11949, "Muthuraj", 2000.0f);
		// method calling
		muthuraj.display();
	}

}
