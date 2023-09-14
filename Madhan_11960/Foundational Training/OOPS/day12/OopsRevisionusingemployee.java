package com.madhan.day12;

class Employee2
{
	//variables
	String name;
	int empid;
	float salary;
	
	//constructor
	Employee2(String name,int empid,float salary)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	
	//display
	void display()
	{
		System.out.println("Employee name:" +name);
		System.out.println("Employee ID:" +empid);
		System.out.println("Employee salary:" +salary);
		
	}
}

public class OopsRevisionusingemployee {

	public static void main(String[] args) {
	Employee2 madhan=new Employee2("Madhan",11960,100000.0f);
	madhan.display();
	Employee2 mohan=new Employee2("Mohan",11961,40000.0f);
	mohan.display();
	}

}
