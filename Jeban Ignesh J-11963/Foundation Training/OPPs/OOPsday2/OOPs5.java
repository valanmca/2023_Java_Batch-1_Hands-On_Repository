package com.jeban.OOPsday2;

class Employee {
	// Variable
	static String org = "Relevantz";
	static String location="Chennai";
	int eId;

	// Constructor
	Employee(int eId) {

		this.eId = eId;
	}

	// Method
	void display() {
		System.out.println("Organization:" + Employee.org);
		System.out.println("Location:" + Employee.location);
		System.out.println(("Employee Id:" + eId));
	}
}

public class OOPs5 {

	public static void main(String[] args) {
		Employee Jeban= new Employee(101);
		Jeban.display();
		Employee Domnic = new Employee(102);
		Domnic.display();

	}

}
