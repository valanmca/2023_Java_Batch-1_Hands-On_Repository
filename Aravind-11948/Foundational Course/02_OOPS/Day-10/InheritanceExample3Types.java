package com.aravind.day10;   //hierarchical level
class Person1
{
 void DisplayName()
 {
	 System.out.println("Name = "+"Aravind");
 }
}
class Employee1 extends Person1                                //person  -superclass
{
	void DisplaySalary()                               //employee      //Student   -subclass
	{
		System.out.println("Salary = "+50000);
	}
}
class Student extends Person1
{
	void DisplayRoll()
	{
		System.out.println("Roll No="+59);
	}
}

public class InheritanceExample3Types {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.DisplayRoll();
		obj.DisplayName();
		//obj.DisplaySalary();//The method DisplaySalary() is undefined for the type Student
		
		
	
	}

}
