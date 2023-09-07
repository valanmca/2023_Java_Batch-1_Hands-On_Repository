package com.purushoth.day8;

class Employee{
	//variables
	int eid;
	String ename;
	float esalary;
	//Constructor
	Employee(int id,String name,float salary){
		System.out.println("Inside constructor");
		eid=id;
		ename=name;
		esalary=salary;
	}
	//Method
	void display() {
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esalary);
	}
}
public class EmployeeClassCreation {

	public static void main(String[] args) {
		// Object creation and calling constructor
		Employee valan=new Employee(101, "Valan", 5000.0f);
		//Method calling
		valan.display();
		
		Employee sara=new Employee(102,"Sara", 3000.0f);
		sara.display();
		
		

	}

}// Class creation using variables constructors method.
