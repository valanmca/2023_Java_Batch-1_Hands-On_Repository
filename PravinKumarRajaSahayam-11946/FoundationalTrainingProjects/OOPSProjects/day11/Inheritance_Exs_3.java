//Using Inheritance (extends) for the Instance Method and Static Method
package com.pravinkumar.day11;

//Getting inputs from the User
class College {

	// variables
	static void detailsOfThecollege() {
		int sCode;
		String sName;
	}

	String sName = "PravinKumar";
	int sCode = 101;
	// Constructors

	College() {
		System.out.println("The College Code is : " + sCode);
		System.out.println("The College Name is : " + sName);
	}

	// Method
	/*
	 * void details() {
	 * 
	 * System.out.println("The College Code is : " + sCode);
	 * System.out.println("The College Name is : " + sName); }
	 */
}

class Student extends College {
	private int Rollno;
	private String Name;
	private float Marks;

	// Variables
	void detailsOfTheStudents() {
		int Rollno;
		String Name;
		float Marks;
	}

	// Constructors
	Student(int Rollno, String Name, float Marks) {
		this.Rollno = Rollno;
		this.Name = Name;
		this.Marks = Marks;
	}

	// Method
	void display() {
		System.out.println("The Rollno is : " + Rollno);
		System.out.println("The Name is : " + Name);
		System.out.println("The Marks is : " + Marks);

	}
}

public class Inheritance_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(101, "PravinKumar", 100);
		obj.display();

		Student object = new Student(102, "PravinKumar", 110);
		object.display();

		Student objects = new Student(103, "PravinKumar", 15000);
		objects.display();

	}

}
