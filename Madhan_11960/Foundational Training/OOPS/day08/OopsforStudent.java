package com.madhan.day08;

class Student
{
	//variable
	String name;
	int rollno;
	String dep;
	
	
	//constructor
	Student(String name,int rollno,String dep)
	{
		this.name=name;
		this.rollno=rollno;
		this.dep=dep;
	}
	
	//method
	void display()
	{
		System.out.println("Student Name:" +name);
		System.out.println("Roll no:" +rollno);
		System.out.println("Department:" +dep);
		
	}
	
}
public class OopsforStudent {

	public static void main(String[] args) {
		Student madhan=new Student("Madhan",22,"MCA");
		madhan.display();
		Student aravindh=new Student("Aravindh",23,"CSE");
		aravindh.display();
		

	}

}
