package com.shiva.day08;

class Employee2
{
	//Variable
	int eid;
	String ename;
	float esalary;

	//Constructor
	Employee2(int eid, String ename, float esalary)
	{
		System.out.println("Inside Constructor");
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	//Method
	void display()
	{
		System.out.println("Employee id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee salary : "+esalary);
	}
}	

public class Employee01 {

	public static void main(String[] args) {
		// Object creation and calling the constructor
		Employee valan=new Employee(101,"valan",2000.0f);
		//Method calling
		valan.display();
		
		Employee shiva=new Employee(102,"Shiva",3000.0f);
		shiva.display();

	}

}
