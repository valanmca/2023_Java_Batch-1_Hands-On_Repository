package com.jeban.OOPsday1;

class Employee {
	// Variables
	int eId;
	String eName;
	float esalary;

	// Constructor
	Employee(int eId, String eName, float esalary)// local variable
	{
		this.eId = eId;
		this.eName = eName;
		this.esalary = esalary;// if the variable and local variable is same name, we have to use "this"
								// keyword to run the program.
	}

	// Method
	void display() {
		System.out.println("Empoloyee Id:" + eId);

		System.out.println("Empoloyee Id:" + eName);

		System.out.println("Empoloyee Id:" + esalary);
	}

}

public class OOPsday1 {

	public static void main(String[] args) {
		// object Creation and Calling Constructor
		Employee Jeban = new Employee(11963, "Jeban", 1000.0f);// Jeban is object
		// Method calling
		Jeban.display();

		Employee Domnic = new Employee(11964, "Domnic", 2000.0f);
		Domnic.display();

		Employee sara = new Employee(11961, "Sara", 3000.0f);
		sara.display();

	}

}
