package com.naveen.day9;

class Student {
	// Variables
	String sname;
	int m1;
	int m2;
	int m3;

	// Constructor
	Student(String sname, int m1, int m2, int m3) {
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	int sum() {
		int sum = m1 + m2 + m3;
		return sum;
	}

	int average() {
		int average = sum() / 3;
		return average;
	}

	String grade() {
		String grade = "";
		if (average() >= 90)
			grade = "A";
		else if (average() >= 60 && average() < 90)
			grade = "B";
		else
			grade = "C";

		return grade;
	}

	// display
	void display() {
		System.out.println("The Student name : " + sname);
		System.out.println("The Mark 1 : " + m1);
		System.out.println("The Mark 2 : " + m2);
		System.out.println("The Mark 3 : " + m3);
		System.out.println("The Total : " + sum());
		System.out.println("The Average : " + average());
		System.out.println("The Grade : " + grade());
	}
}

public class StudentMarks {

	public static void main(String[] args) {
		Student obj = new Student("Naveen", 78, 85, 95);
		obj.display();
	}

}
