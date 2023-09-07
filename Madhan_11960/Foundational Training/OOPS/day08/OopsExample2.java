package com.madhan.day08;

class Employee2
{
	//Variable
	int eid;
	String ename;
	float esalary;	
	
	//constructor
	Employee2(int eid, String ename, float esalary)
	{
		System.out.println("Inside Constructor");
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	
	//method
	void display()
	{
		System.out.println("Employee id:" +eid);
		System.out.println("Employee Name:" +ename);
		System.out.println("Employee Salary:" +esalary);
		
	}
}

public class OopsExample2 {

	public static void main(String[] args) {
		Employee2 madhan=new Employee2(1,"Madhan",10000);
		madhan.display();
		Employee2 aravindh=new Employee2(2,"Aravindh",20000);
		aravindh.display();
		Employee2 sankar=new Employee2(3,"Sankar",30000);
		sankar.display();
		

	}

}
