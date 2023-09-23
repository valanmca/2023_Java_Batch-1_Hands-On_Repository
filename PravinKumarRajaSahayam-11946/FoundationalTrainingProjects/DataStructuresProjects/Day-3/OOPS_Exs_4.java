package com.pravinkumar.day9;

class Student {
	//Variables
	int srollno;
	String sname;
	int sstd;
//Constructors
	Student(int srollno, String sname, int sstd) {
		System.out.println("Inside Constructors : ");
		this.srollno = srollno;
		this.sname = sname;
		this.sstd = sstd;
	}
//Method
	void display() {
		System.out.println("Student Rollno : " + srollno);
		System.out.println("Student name : " + sname);
		System.out.println("Student std : " + sstd);
	}
}

public class OOPS_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object Creation and Constructors Calling
		Student PravinKumar = new Student(11946, "PravinKumar", 1);
		PravinKumar.display();
		Student valan = new Student(11947, "Valan", 2);
		valan.display();
		Student naveen = new Student(11948, "naveen", 3);
		naveen.display();
	}

}
