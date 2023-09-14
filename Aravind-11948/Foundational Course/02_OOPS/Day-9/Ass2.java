package com.aravind.day9;
class Student
{
	String name;
	int mark1;
	int mark2;
	int mark3;
	int sum;
	int avg;
	
	Student(String name,int mark1,int mark2,int mark3)//constructor
	{
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
	}
	
	int getTotal() {
		sum = mark1 +  mark2 + mark3;
		return sum;
	}
	int getAvg()
	{
	  avg = getTotal() / 3;
	  return avg;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Total="+getTotal());
		System.out.println("Average = " + getAvg());
	}
}
public class Ass2 {

	public static void main(String[] args) {
		Student obj=new Student("aravind",50,50,50);
		
		obj.display();
		Student obj1=new Student("madhan",75,50,50);
	
		obj1.display();
		
		

	}

}
