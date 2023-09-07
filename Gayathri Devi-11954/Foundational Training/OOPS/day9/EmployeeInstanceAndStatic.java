package com.gayathri.day9;

class Employee {

	// variables //instance variables
	int eid;
	String ename;
	float esalary;
	
	static String Org = "Relevantz";

	// constructor - same name as class name, never return any value using for
	// initialization
	Employee(int id, String name, float salary)// local variable
	{
		eid = id; // instance = local
		ename = name;
		esalary = salary;

		/*
		 * //this keyword is used to point the current object this.eid = eid; this.ename
		 * = ename; this.esalary = esalary;
		 */
	}

	// method definition
	void display() // instance method
	{
		System.out.println("\nEmployee Organization : " + Employee.Org);
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee salary : " + esalary);
	}
}

public class EmployeeInstanceAndStatic {
		
	public static void main(String[] args) {

		Employee gayathri = new Employee(11953, "Dharshana", 1000.35f);
		gayathri.display();

		Employee devi = new Employee(11954, "Gayathri", 1000.35f);
		devi.display();
	}

}
