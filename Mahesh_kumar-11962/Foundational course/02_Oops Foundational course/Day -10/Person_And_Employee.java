package com.mahesh.Oops_day10;

class Person {
 void name()
 {
	 System.out.println("Name : Mahesh");
 }
}
class Employee extends Person
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
public class Person_And_Employee
{
	public static void main(String[] args) {
		Employee ob = new Employee();
		ob.name();
		ob.empid();
		ob.salary();

	}

}
