package com.aravind.day8;
class Employee
{
	// variable
	int eid=101;
	String ename="valan";
	float esalary=2000.0f;
	//method
	void display()
	{
		System.out.println("employee id :"+eid);
		System.out.println("employee name :"+ename);
		System.out.println("employee salary :"+esalary);
		
	}
}
public class OppsExample1 {

	public static void main(String[] args) {
		Employee aravind =new Employee();//object creation
		aravind.display();
		
		
		
	}

}
