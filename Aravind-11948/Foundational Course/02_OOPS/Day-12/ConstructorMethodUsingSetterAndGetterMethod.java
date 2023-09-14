package com.aravind.day12;
class Employee1
{
	int eId;
	String eName;
	int eSalary;
	Employee1(int eId,String eName,int eSalary)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
		
	}
	void Setsalary(int eSalary)
	{
		this.eSalary=eSalary;
	}
	void display()
	{
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eSalary);
	}
	
	
}

public class ConstructorMethodUsingSetterAndGetterMethod {

	public static void main(String[] args) {
		Employee1 obj=new Employee1(11948,"aravind",10000);
		obj.display();
		obj.Setsalary(20000);
		obj.display();
		
		
		

	}

}
