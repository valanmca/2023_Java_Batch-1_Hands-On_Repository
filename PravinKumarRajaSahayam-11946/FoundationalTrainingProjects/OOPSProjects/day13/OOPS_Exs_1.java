//Using OOPS for the change the values for adding one more constructors
package com.pravinkumar.day13;

class Employee {
	// Variables
	int eid;
	String ename;
	float esalary;

	// Constructors
	Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	// Method(Display the Values)
	void display()

	{
		System.out.println("The Employee Id is : " + eid);
		System.out.println("The Employee Name is : " + ename);
		System.out.println("The Employee Salary is : " + esalary);
	}

//Setter
	// Change the Salary Values with the help of Constuctors and Methods
	void setSalary(float value) {
		this.esalary = value;
		System.out.println("The Employee Salary after one month is : " + esalary);
	}
}

public class OOPS_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// calling the constructor for the initial values
		Employee obj = new Employee(101, "PravinKumar", 1.0f);
		obj.display();
		// Calling the Change numbers Constructors Methods Values Salary
		obj.setSalary(8.0f);
		obj.display();
	}

}
