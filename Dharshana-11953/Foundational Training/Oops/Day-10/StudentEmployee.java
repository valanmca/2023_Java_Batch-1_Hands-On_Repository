package com.dharshu.day10;

//Single Inheritance
class Person{
	void display() {
		System.out.println("\nName: Dharshu");
	}
}

class Income extends Person{
	void displaySalary() {
		System.out.println("The  Salary : 8,537 Only");
	}
}

class Student extends Person{
	void displayrollno() {
		System.out.println("The Rollno is:11953");
	}
}

public class StudentEmployee {

	public static void main(String[] args) {
		Income in=new Income();
		in.display();
		in.displaySalary();
		
		Student stud=new Student();
		stud.display();
		stud.displayrollno();
	}

}
