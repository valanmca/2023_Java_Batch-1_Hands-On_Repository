//Java program to create school class with addStudent,removeStudent and addTeacher methods.
package com.sara.CoreJava.Day_04;

import java.util.ArrayList;

class School {
	ArrayList<String> students = new ArrayList<String>();
	ArrayList<String> teachers = new ArrayList<String>();
	ArrayList<String> classes = new ArrayList<String>();

	void addStudent(String student) {
		students.add(student);
		System.out.println("Stduent " + student + " is Added");
	}

	void removeStudent(String student) {
		students.add(student);
		System.out.println("Stduent " + student + " is Removed");
	}

	void addTeacher(String teacher) {
		teachers.add(teacher);
		System.out.println("Teacher " + teacher + " is Added");
	}

	void removeTeacher(String teacher) {
		teachers.add(teacher);
		System.out.println("Teacher " + teacher + " is Removed");
	}

	void studentsDetails() {
		System.out.println(students);
	}

	void teachersDetails() {
		System.out.println(teachers);
	}

	void createClass(int std, char sec) {
		System.out.println("Class " + std + "-" + sec + " is created");
	}
}

public class Assignment_05 {

	public static void main(String[] args) {

		School obj = new School();
		obj.addStudent("Sara");
		obj.addStudent("jaban");
		obj.addStudent("Shaji");

		obj.studentsDetails();

		obj.addTeacher("Mahesh");

		obj.teachersDetails();

		obj.createClass(12, 'A');

	}

}
