package com.jeban.Practice;

import java.util.*;

class Student {
	String Name;
	String Grade;
	ArrayList<String> Courses = new ArrayList<String>();

	Student(String Name, String Grade) {
		this.Name = Name;
		this.Grade = Grade;
		
	}

	void add_Course(String Course) {
		Courses.add(Course);
	}

	void remove_Course(String Course) {
		Courses.remove(Course);
	}

	void display() {
		System.out.println("Student Name:"+Name);
		System.out.println("Student Grade:"+Grade);
		System.out.println("Student Courses:"+Courses);

	}

}

public class Practice1 {

	public static void main(String[] args) {
		Student student1 = new Student("Jeban", "A+");
		student1.add_Course("Chemistry");
		student1.add_Course("Physics");
		student1.add_Course("Maths");
		student1.add_Course("Tamil");
		student1.add_Course("English");
		student1.display();
		student1.remove_Course("English");
		student1.display();

	}

}
