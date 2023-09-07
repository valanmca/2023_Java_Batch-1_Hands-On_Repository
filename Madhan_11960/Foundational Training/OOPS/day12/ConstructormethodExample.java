package com.madhan.day12;

class Employee
{
	int empid;
	String ename;
	int empsalary;
	
	Employee(int empid,String ename, int empsalary)
	{
		this.empid=empid;
		this.ename=ename;
		this.empsalary=empsalary;
	}
	
	
	public int getSalary()
	{
		return empsalary;
	}
	
	public void setSalary(int empsalary)
	{
		this.empsalary=empsalary;
		
	}
	
	void display()
	{
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+empsalary);
	}
	
}

public class ConstructormethodExample {

	public static void main(String[] args) {
		Employee emp=new Employee(11960,"Madhan",50000);
		emp.display();
		emp.setSalary(20000);
		emp.display();
        
	}

}
