package com.aravind.day8;
class Employee3
{ 
	//varible
	int eid;// instance variable eid ename esalary
	String ename;
	float esalary;
	
	//constructor must me in class name it dont return any value 
	
	Employee3(int eid,String ename,float esalary)//if local variable and instance variable is same we have to use THIS keyword 
	{
		System.out.println("Inside the constructor");
		this.eid=eid;// proper coding 
		this.ename=ename;
		this.esalary=esalary;
		
	}
	// method
	void display()
	{
		System.out.println("employee id :"+eid);
		System.out.println("employee name :"+ename);
		System.out.println("employee salary :"+esalary);
	}
}


public class OopsExampleThis4 {

	public static void main(String[] args) {
		//object creation and calling the constructor
				Employee3 aravind=new Employee3(101,"aravind",2000.f);
				//method calling
				aravind.display();
				//object creation 
				
				Employee3 madhan=new Employee3(102,"madhan",2001.f);
				//method calling
				
				madhan.display();
		

	}

}
