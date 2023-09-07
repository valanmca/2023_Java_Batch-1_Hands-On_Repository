package com.shiva.day08;

class Employee
{
	//Variable
	int eid;
	String ename;
	float esalary;

	//Constructor
	Employee(int id, String name, float salary)
	{
		System.out.println("Inside Constructor");
		eid=id;
		ename=name;
		esalary=salary;
	}
	//Method
	void display()
	{
		System.out.println("Employee id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee salary : "+esalary);
	}
}	

public class OopsClass {

	public static void main(String[] args) {
		// Object creation and calling the constructor
		Employee valan=new Employee(101,"valan",2000.0f);
		//Method calling
		valan.display();
		
		Employee shiva=new Employee(102,"Shiva",3000.0f);
		shiva.display();

	}

}
