//Class Object Example Program with Student details

package com.jeyandhan.day08;

class Student{
	//Variables
	
	int rNo;
	String name;
	String dept;
	
	//Constructor
	Student(int rNo, String name, String dept){
		System.out.println("\n\t*****Student Detail*****\n");
		this.rNo = rNo;
		this.name = name;
		this.dept = dept;
	}
	//Method 
	void display() {
		System.out.println("Enter the Student RollNo: "+rNo);
		System.out.println("Enter the Student Name: "+name);
		System.out.println("Enter the Student Department: "+dept);
	}
	
}

public class StudentDetails {

	public static void main(String[] args) {
		//object creation constructor calling
		Student jeyandhan = new Student(61,"Jeyandhan","Mca");
		jeyandhan.display();
		Student shaji = new Student(52,"Shaji","BCA");
		shaji.display();
		Student sara = new Student(57,"Sara","CSE");
		
		//Method Calling
		
		
		sara.display();
	}

}
