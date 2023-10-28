package com.sara.CoreJava.Day_01;

/***** Java program for Student Details *****/
public class Student_Details {

	// Variables

	int Student_id;
	String Student_Name;
	float Student_Mark;

	// Constructor

	Student_Details(int Student_id, String Student_Name, float Student_Mark) {

		this.Student_id = Student_id;
		this.Student_Name = Student_Name;
		this.Student_Mark = Student_Mark;
	}

	// Method

	public void display() {
		System.out.println("Stduent ID is : " + Student_id);
		System.out.println("Stduent Name is : " + Student_Name);
		System.out.println("Stduent Mark is : " + Student_Mark);
	}

	public static void main(String[] args) {
		Student_Details sara = new Student_Details(101, "SARA", 444);
		sara.display();
	}

}
