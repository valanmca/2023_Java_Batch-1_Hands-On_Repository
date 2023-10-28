/***** Java program to create a class called "Student" with a collection of 
 students and methods to add and remove students *******/

package com.sara.CoreJava.Day_01;

import java.util.ArrayList;

class student {

	// Variables
	String Student_Name;
	char Student_Grade;
	ArrayList<String> Course_List = new ArrayList<String>();

	// Constructor

	student(String Student_Name, char Student_Grade) {
		this.Student_Name = Student_Name;
		this.Student_Grade = Student_Grade;
		// this.Course_List = Course_List;
	}

	// Methods
	// Method to add courses
	public void addCourse(String Course) {
		Course_List.add(Course);
		System.out.println("Course Added");
	}

	// Method to remove courses
	public void removeCourse(String Course) {
		Course_List.remove(Course);
		System.out.println("Course Removed");
	}

	// Method to display student details
	public void display() {
		System.out.println("Student Name is : " + Student_Name);
		System.out.println("Student Grade is : " + Student_Grade);
		System.out.println("Student Courses are : " + Course_List);
		System.out.println(" ");
	}
}

public class Assignment_05 {

	public static void main(String[] args) {

		student sara = new student("Sara", 'A');
		sara.display();

		sara.addCourse("Maths");
		sara.display();

		sara.addCourse("Chemistry");
		sara.display();

		sara.removeCourse("Maths");
		sara.display();
	}

}
