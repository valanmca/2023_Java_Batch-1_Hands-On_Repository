package com.purushoth.day8;

class Student{
	//Variables
	int rollno;
	String sname;
	String dept;
	char sec;
	
	//Constructor
	Student(int rollno,String sname,String dept,char sec){
		this.rollno=rollno;
		this.sname=sname;
		this.dept=dept;
		this.sec=sec;
	}
	//Method
	void display() {
		System.out.println("Student RollNo: "+rollno);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Department: "+dept);
		System.out.println("Student Section: "+sec);
	}
	
}
public class StudentClassCreation {

	public static void main(String[] args) {
		// object creation and calling constructor
		Student sara=new Student(11,"Sara","CSE",'A');
		//method call
		sara.display();
		
		Student jenish=new Student(15,"Jenish","CSE",'B');
		jenish.display();

	}

}
