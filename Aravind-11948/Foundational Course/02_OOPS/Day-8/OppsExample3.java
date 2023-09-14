package com.aravind.day8;
class Employee2
{ 
	//varible
	int eid;// instance variable eid ename esalary
	String ename;
	float esalary;
	
	//constructor must me in class name it dont return any value 
	
	Employee2(int id,String name,float salary)// local variable id,name,salary
	{
		System.out.println("Inside the constructor");
		eid=id;
		ename=name;
		esalary=salary;
		
	}
	// method
	void display()
	{
		System.out.println("employee id :"+eid);
		System.out.println("employee name :"+ename);
		System.out.println("employee salary :"+esalary);
	}
}

public class OppsExample3 {

	public static void main(String[] args) {
		//object creation and calling the constructor
		Employee2 aravind=new Employee2(101,"aravind",2000.f);
		//method calling
		aravind.display();
		//object creation 
		
		Employee2 madhan=new Employee2(102,"madhan",2001.f);
		//method calling
		
		madhan.display();
		

	}

}
