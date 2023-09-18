//Using this. Method in the OOP
package com.pravinkumar.day9;

class Details {
	// Variables
	int eid;
	String ename;
	float esalary;

	// Constructors
	Details(int eid, String ename, float esalary) {
		System.out.println("Inside Constructors : ");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

//Method
	void display() {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee salary : " + esalary);
	}
}

public class OOPS_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object Creation and Constructor Calling
		Details PravinKumar = new Details(101, "PravinKumar", 2000.0f);
		PravinKumar.display();
		Details valan = new Details(102, "valan", 3000.0f);
		valan.display();
		Details naveen = new Details(103, "naveen", 5000.0f);
		naveen.display();
	}

}
