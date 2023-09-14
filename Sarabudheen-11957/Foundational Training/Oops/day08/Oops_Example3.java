/*********** Creating Class For Student... **********/
package com.sara.day08;

class Student {
	// Variables
	String sname;
	int sid;
	String sdep;

	// Constructor
	Student(String sname, int sid, String sdep) {
		System.out.println(" ");
		this.sname = sname;
		this.sid = sid;
		this.sdep = sdep;
	}

	// Method
	void display() {
		System.out.println("The Student Name is :" + sname);
		System.out.println("The Student Roll Number is :" + sid);
		System.out.println("The Student from the Department of :" + sdep);
	}
}

public class Oops_Example3 {

	public static void main(String[] args) {
		// Object creation and Constructor calling...
		Student sara = new Student("Sara", 101, "CSE");
		sara.display();

		Student purush = new Student("Purushoth", 102, "CSE");
		purush.display();

		Student shiva = new Student("Smart Shiva", 103, "EEE");
		shiva.display();

	}

}
