package com.aravind.day12;
class Employee
{
	int eId;
	String eName;
	int eSalary;
	Employee(int eId,String eName,int eSalary)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
		
	}
	void display()
	{
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eSalary);
	}
	void Setsalary()
	{
		eSalary=20000;
		System.out.println(eSalary);
		System.out.println(eId);
		System.out.println(eName);
		
	}
	
}

public class ConstructorMethodExample1 {

	public static void main(String[] args) {
		Employee obj=new Employee(11948,"aravind",10000);
		obj.display();
		obj.Setsalary();
		//obj.display();
		
		Employee obj1=new Employee(11948,"aravind",30000);
		obj1.display();
		

	}

}
