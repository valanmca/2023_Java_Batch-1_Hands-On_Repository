package com.purushoth.day8;

class Employee1{
	//variables
	int eid;
	String ename;
	float esalary;
	//Constructor
	Employee1(int eid,String ename,float esalary){
		this.eid=eid;
		this.ename=ename;
	    this.esalary=esalary;
	}
	//Method
	void display() {
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esalary);
	}
}
public class ClassCreationObjectMethod {

	public static void main(String[] args) {
		// Object creation and calling constructor
		Employee1 valan=new Employee1(101, "Valan", 5000.0f);
		//Method calling
		valan.display();
		
		Employee1 sara=new Employee1(102,"Sara", 3000.0f);
		sara.display();
		
		

	}

}

