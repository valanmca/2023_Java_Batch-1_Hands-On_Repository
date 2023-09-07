package com.mahesh.Oops_day10;
class Person_01 {
	 void name()
	 {
		 System.out.println("Name : Mahesh");
	 }
	}
	class Employee_01 extends Person_01
	{
		void salary()
		{
			System.out.println("Salary : 8500");
			
		}
		void empid()
		{
			
			System.out.println("Employee id : 11962");
		}
		
	}
class student extends Person_01
{
	void rollno()
	{   name();
		System.out.println("Rollno : 21pa23");
	}
}


public class Inheritance_Employee {

	public static void main(String[] args) {
	
		student mahe= new student();
		mahe.rollno();
		
		Employee mahesh = new Employee();
		mahesh.name();
		mahesh.salary();
		mahesh.empid();

	}

}
