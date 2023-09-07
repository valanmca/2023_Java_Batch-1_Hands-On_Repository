
package com.madhan.day09;

class Student
{
	String name;
	int mark1;
	int mark2;
	int mark3;
	
	Student(String name,int mark1,int mark2,int mark3)
	{
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	int getSum()
	{
		int sum=mark1+mark2+mark3;
		return sum;
	}
	
	int getAvg()
	{
		int avg=getSum()/3;
		return avg;
	}
	
	void display()
	{
		System.out.println("Name of the Student:" +name);
		System.out.println("Total marks:"+ getSum());
		System.out.println("Average:" +getAvg());
//		
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Student obj1=new Student("Madhan",89,92,98);
		obj1.display();

	}

}
