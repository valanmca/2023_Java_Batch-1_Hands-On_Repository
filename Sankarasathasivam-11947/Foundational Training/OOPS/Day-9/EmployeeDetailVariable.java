package com.shiva.day09;

class Employee
	{
	
	//Variable
	static String org = "Relevantz";
	int eid;
	
	//Constructor
	Employee(int eid)
	{
		this.eid=eid;
	}
	
	//Method
	void display()
	{
		System.out.println("Organization : "+org);
		System.out.println("Employee id : "+eid);
	}
	}
public class EmployeeDetailVariable {

	public static void main(String[] args) {
		
		Employee obj=new Employee(11947);
		obj.display();
		
		Employee obj1=new Employee(1175);
		obj1.display();

	}

}
