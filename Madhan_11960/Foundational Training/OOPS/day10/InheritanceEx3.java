package com.madhan.day10;

// This is an example of Hierarchical inheritance

class Student1  //parent class
{
	void displayName()
	{
		System.out.println("Madhan");
	}
}

class Employee1 extends Student1 // first child class
{
	void salary()
	{
		System.out.println(55000);
	}
}

class Person extends Student1 // second child class
{
	void age()
	{
		System.out.println("Student age:"+23);
	}
	void Dob()  // In one class , we can define n number of methods
	{
		
		System.out.println("DOB:01/07/2000");
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.displayName();
		obj.age();
		obj.Dob();
		

	}

}
