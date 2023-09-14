package com.aravind.day8;
class Student
{
	// variable
	
	int roll;
	String name;
	String dep;
	
	//constructor
	Student(int roll,String name,String dep)
	{
		System.out.println("constructor works");
		this.roll=roll;
		this.name=name;
		this.dep=dep;
		
	}
	//method
	void display()
	{
		System.out.println("Roll number :"+roll);
		System.out.println("name :"+name);
		System.out.println("dep :"+dep);
		
		
	}
	
}

public class StudentClassExample4 {

	public static void main(String[] args) {// for one class we are able to create n number of class
		//obj 1 aravind
		Student aravind=new Student(59,"aravind","CSE");
		aravind.display();
		//obj 2 madhan
		Student madhan=new Student(57,"madhan","EcE");
		madhan.display();
		
	}

}
