package com.madhan.day09;

class Employee
{
	static String org;
	int eid;
	
	//constructor
	Employee(int eid)
	{
	    Employee.org="Relevantz";
		this.eid=eid;
	}
	
	void display()
	{
		System.out.println("Organization Name:" +org);
		System.out.println("Employee Id:" +eid);
	}
}
public class InstancestaticusingClass {

	public static void main(String[] args) {
		Employee obj1=new Employee(11960);
         obj1.display();
         Employee obj2=new Employee(11942);
         obj2.display();
	}

}
