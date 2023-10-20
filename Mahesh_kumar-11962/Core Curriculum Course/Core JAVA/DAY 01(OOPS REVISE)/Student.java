package com.mahesh.core_java;

import java.util.Scanner;
import java.util.ArrayList;

public class Student {

	// variables;
	String S_name;
	String S_grade;
	String course;
	static int input;
	static char choice;

	ArrayList<String> S_course = new ArrayList<String>();
	static Scanner sc_obj = new Scanner(System.in);

	// Methods
	void Add_Student() {

		System.out.println("Enter student Name : ");
		S_name = sc_obj.next();
		System.out.println("Enter student Grade : ");
		S_grade = sc_obj.next();

	}

	void Add_Course() {
		System.out.println("  ADD COURSE");
		System.out.println("Enter student Course : ");
		S_course.add(course = sc_obj.next());
	}

	void Remove_Course() {
		System.out.println("REMOVE COURSE");
		System.out.println("Enter student Course : ");
		S_course.remove(course = sc_obj.next());

	}

	void Show() {
		System.out.println("  Student Details ");
		System.out.println("student Name : " + S_name);
		System.out.println("student Grade : " + S_grade);
		System.out.println("student Course : " + S_course);
		
	}

	public static void main(String[] args) {
		
		Student action = new Student();
		action.Add_Student();
		
		do
		{
		System.out.println("\t-*-*-*-ADD/REMOVE COURSE-*-*-*-");
		System.out.println("Add course press 1 / Delete course press 2 / View details press 3");

		input = sc_obj.nextInt();
		
		if(input == 1)
		{
			action.Add_Course();	
		}	
		else if(input == 2)
		{
			action.Remove_Course();
		}
		
		else if(input ==3)
		{
			action.Show();
		}
		
		else
		{
			System.out.println("Plz choose 1 to 3");
		}
		System.out.println("Do you want to repeat ?(press s)");
		choice = sc_obj.next().charAt(0);
		}
		while(choice=='s');
	
	}

}
