//Class Object Example Program with employee details

package com.jeyandhan.day08;

class Employee {
	// variables
	int empId;
	String empName;
	float eSalary;

	// constructor
	Employee(int eId, String eName, float eSalary) {
		System.out.println("");
		this.empId = eId;
		this.empName = eName;
		this.eSalary = eSalary;
	}

	// method
	void display() {
		System.out.println("Enter the Employee Id: " + empId);
		System.out.println("Enter the Employee Id: " + empName);
		System.out.println("Enter the Employee Id: " + eSalary);
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// object creation and calling the constructor
		Employee jeyandhan = new Employee(11, "Jeyandhan", 5000.0f);
		// method calling
		jeyandhan.display();

		Employee naga = new Employee(111, "Naga", 3000.0f);
		naga.display();

	}

}
