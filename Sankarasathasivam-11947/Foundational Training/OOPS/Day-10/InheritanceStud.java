package com.shiva.day10;

//Heirarchical Inheritance

class Person1
{
	void displayName()
	{
		System.out.println("Shiva");
	}
}

class Employee1 extends Person1
{
	void displaySalary()
	{
		System.out.println("8000");
	}
}

class Student extends Person1
{
	void displayRollNo()
	{
		System.out.println("11947");
	}
}

public class InheritanceStud {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.displayName();
//		student.displaySalary();//The method displaySalary() is undefined for the type Student
		student.displayRollNo();

	}

}
