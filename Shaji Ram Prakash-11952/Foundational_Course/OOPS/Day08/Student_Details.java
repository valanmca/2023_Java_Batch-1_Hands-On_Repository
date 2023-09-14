package com.shaji.Day08;

class Student {
	// variable
	int rollNum;
	String name;
	String dept;

	// Constructor
	Student(int rollNum, String name, String dept) {
		System.out.println("\n\t******Student_Details******\n");
		this.rollNum = rollNum;
		this.name = name;
		this.dept = dept;
	}

//Method
	void display() {
		System.out.println("Roll-Number : " + rollNum);
		System.out.println("Name : " + name);
		System.out.println("Department : " + dept);
	}
}

public class Student_Details {

	public static void main(String[] args) {

//Object creation and constructor and calling
		Student shaji = new Student(11952, "Shaji", "BCA");
		shaji.display();
		Student sara = new Student(11957, "Sara", "CSE");
		sara.display();
		Student the_boss = new Student(11961, "The BOSS", "MCA");
		the_boss.display();
	}

}
