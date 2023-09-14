/***** Creating Methods for Students Marks,Total,Average and Grades... ******/
package com.sara.day09;

class student {
	String name;
	int m1;
	int m2;
	int m3;

	student(String name, int m1, int m2, int m3) {
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	int total() {
		int sum = m1 + m2 + m3;
		return sum;
	}

	int avg() {
		int avg = total() / 3;
		return avg;
	}

	String grades() {
		String grade = " ";
		if (avg() >= 90)
			grade = "A";
		else if (avg() >= 60 && avg() < 90)
			grade = "B";
		else
			grade = "C";
		return grade;
	}

	void diaplay() {
		System.out.println("Name : " + name);
		System.out.println("Mark 1 : " + m1);
		System.out.println("Mark 2 : " + m2);
		System.out.println("Mark 3 : " + m3);
		System.out.println("Total : " + total());
		System.out.println("Average : " + avg());
		System.out.println("Grade : " + grades());

	}
}

public class Oops_Assignment02 {

	public static void main(String[] args) {
		student sara = new student("Sara", 50, 60, 55);
		sara.diaplay();

	}

}
