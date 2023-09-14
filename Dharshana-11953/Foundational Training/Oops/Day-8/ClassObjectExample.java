package com.dharshu.day8;

class Employee{
	
	//instance variable---instance means inside the object variable.
	int eid;
	String ename;
	float esalary;
	
	//constructor
	//constructor is used to initialize the variable
	//the constructor name must be same as the class name
	Employee(int eid,String ename,float esalary){
		System.out.println("Constructor Execution");
		
		//this keyword refers the current object.
		//we can avoid name conflict between local and instance variable by using "this" keyword
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		
	}
	
	//instance method
	void display() { //the method name can be anything
		System.out.println("Employee id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+esalary);		
	}
}

public class ClassObjectExample {

	public static void main(String[] args) {
		
		//object creation and calling the constructor
		Employee emp=new Employee(101,"Dharshu",23000.0f);
		//method calling
		emp.display();
		
		//we can create 'n' number of object for a single class
		Employee emp1=new Employee(102,"Minion",10000.0f);
		emp1.display();
	}

}
