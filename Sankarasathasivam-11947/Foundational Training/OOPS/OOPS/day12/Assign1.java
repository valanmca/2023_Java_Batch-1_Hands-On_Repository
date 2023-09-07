package com.shiva.day12;

class Employee
{
	//Variables
	int eId;
	String eName;
	int eSalary;
	
	//Constructor
	Employee(int eId,String eName, int eSalary)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
	}
	
	public int getSalary()//getter
	{
		return eSalary;
	}
	
	void setSalary(int eSalary)//setter
	{
		this.eSalary=eSalary;
//		System.out.println("Updated Employee Salary : "+eSalary);
	}
	
	void display()
	{
		System.out.println("Employee Id : "+eId);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Salary : "+eSalary);
	}
}
public class Assign1 {

	public static void main(String[] args) {
		
		Employee employee=new Employee(11947,"Shiva",8000);
		employee.display();
		System.out.println("------------------------------");
		employee.setSalary(10000);
		employee.display();
	}

}
