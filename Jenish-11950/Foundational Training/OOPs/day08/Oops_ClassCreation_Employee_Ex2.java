package com.jenish.day08;


class Employee1{
	//Variables
	int eid;
	String ename;
	float esalary;

//Constructor
Employee1(int id, String name, float salary){
	System.out.println("Inside Constructor");
	this.eid=id;
	this.ename=name;
	this.esalary=salary;
}
//Methods
void display() {
	System.out.println("Employee id:" +eid);
	System.out.println("Employee name:" +ename);
	System.out.println("Employee esalary:" +esalary); 
}
}
public class Oops_ClassCreation_Employee_Ex2 {
	
	
	public static void main(String[] args) {
		//Object Creation and Calling Constructor
		Employee jenish = new Employee(101,"Jenish", 2000.0f);
		//Method Calling
		jenish.display();
		Employee muthuraj = new Employee(102,"Muthuraj", 3000.0f);
		muthuraj.display();
	}

}

