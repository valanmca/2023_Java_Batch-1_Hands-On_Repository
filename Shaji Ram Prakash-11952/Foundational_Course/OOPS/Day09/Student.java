package com.shaji.Day09;

public class Student {
	
	//Variables
	String sname;
	int m1,m2,m3;
	int totalMarks;
	int avg;
	
	//Constructor
	Student(String sname, int m1, int m2, int m3){
		this.sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	int getTotal() {
		totalMarks = m1 + m2 + m3;
		return totalMarks;
	}
	
	int getAvg() {
		return (totalMarks / 3);
	}
	void display() {
		System.out.println("Student Name : "+sname);
		System.out.println("Mark 1 : "+m1);
		System.out.println("Mark 2 : "+m2);
		System.out.println("Mark 3 : "+m3);
		System.out.println("Total Marks : "+getTotal());
		System.out.println("Average : "+getAvg());
		
	}

	public static void main(String[] args) {
		Student shaji = new Student("Shaji", 90, 95, 98);
		shaji.display();

		Student sara = new Student("sara", 98, 80, 92);
		sara.display();
		
		Student boss = new Student("The BOSS", 94, 93, 98);
		boss.display();
	}

}
