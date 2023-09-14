package com.madhan.day10;

//This is Example of Single Inheritance


class Student  //parent class
{
	void displayName()
	{
		System.out.println("Madhan");
	}
}

class Employee extends Student //child class
{
	void salary()
	{
		System.out.println(55000);
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.displayName();
		obj.salary();
		
		
	}

}
