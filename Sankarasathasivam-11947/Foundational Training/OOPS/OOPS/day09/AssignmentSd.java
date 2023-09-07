package com.shiva.day09;

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
	
	float getAvg()
	{
		float avg=getSum()/3;
		return avg;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Total : "+getSum());
		System.out.println("Total : "+getAvg());
		
	}
	
}
public class AssignmentSd {

	public static void main(String[] args) {
		
		Student obj=new Student("Shiva",50,50,50);
		obj.display();
		
	}

}
