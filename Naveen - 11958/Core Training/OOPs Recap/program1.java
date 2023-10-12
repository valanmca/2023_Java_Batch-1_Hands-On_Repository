package com.naveen.day1;

class Employee {
	int eid;
	String ename;
	float esalary;

	Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	void display() {
		System.out.println("\nThe Employee Id: " + eid);
		System.out.println("The Employee Name: " + ename);
		System.out.println("The Employee Salary: " + esalary);
	}
}

public class program1 {

	public static void main(String[] args) {

		Employee obj = new Employee(101, "Naveen", 5000);
		obj.display();

		Employee obj1 = new Employee(102, "Gayathri", 6000);
		obj1.display();

		Employee obj2 = new Employee(103, "Pravin", 7000);
		obj2.display();

		Employee obj3 = new Employee(104, "Jenish", 8000);
		obj3.display();

	}

}
