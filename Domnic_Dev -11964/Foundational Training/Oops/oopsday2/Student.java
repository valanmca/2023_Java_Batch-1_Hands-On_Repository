package com.domnic.day9;

public class Student {

	String name;
	int mark1, mark2, mark3;

	Student(String name, int mark1, int mark2, int mark3) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	int average() {
		int avg = (mark1 + mark2 + mark3) / 3;
		return avg;
	}

	int total() {
		int total = mark1 + mark2 + mark3;
		return total;
	}

	String Grade() {
		String grade = "";
		if (average() >= 90) {
			grade = "A";
		} else if (average() >= 60 && average() < 90)
			grade = "B";
		else
			grade = "c";
		return grade;
	}

	void display() {

		System.out.println("Name of the student is :" + name);
		System.out.println("Mark 1 :" + mark1);
		System.out.println("Mark 2 :" + mark2);
		System.out.println("Mark 3 :" + mark3);
		System.out.println("Total Marks :" + total());
		System.out.println("Total average is :" + average());
		System.out.println("Grades are :"+Grade());
	}

	public static void main(String[] args) {
		Student obj1 = new Student("Domnic", 81, 92, 70);
		obj1.display();

	}

}
