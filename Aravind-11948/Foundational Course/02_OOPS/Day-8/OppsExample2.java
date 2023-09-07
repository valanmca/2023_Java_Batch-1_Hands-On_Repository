package com.aravind.day8;
class Employee1
{
	// variable
	int eid;
	String ename;
	float esalary;
	//method
	void display()
	{
		System.out.println("employee id :"+eid);
		System.out.println("employee name :"+ename);
		System.out.println("employee salary :"+esalary);
		
	}
}

public class OppsExample2 {

	public static void main(String[] args) {
		Employee1 aravind =new Employee1();//object creation
		aravind.display();

	}

}
