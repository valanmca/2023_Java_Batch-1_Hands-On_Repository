package com.naveen.day8;

class Student {
	int rollNo;
	String name;
	int grade;

	Student(int rollNo, String name, int grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	void display() {
		System.out.println("Roll No : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
	}
}

public class OopsEx03 {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Naveen", 3);
		s1.display();

		Student s2 = new Student(102, "Arun", 2);
		s2.display();

		Student s3 = new Student(103, "Ram", 1);
		s3.display();

	}

}
