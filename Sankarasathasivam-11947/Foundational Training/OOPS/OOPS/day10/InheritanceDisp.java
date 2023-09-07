package com.shiva.day10;

//single level inheritance

class Person
{
	void displayName()
	{
		System.out.println("Shiva");
	}
}

class Employee extends Person
{
	void displaySalary()
	{
		System.out.println("8000");
	}
}

class Age extends Employee
{
	void DoB()
	{
		System.out.println("16/02/2002");
	}
}
public class InheritanceDisp {

	public static void main(String[] args) {
		
		Age age=new Age();
		age.displayName();
		age.displaySalary();
		age.DoB();

	}

}
