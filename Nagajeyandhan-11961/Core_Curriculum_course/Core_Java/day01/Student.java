package com.jeyandhan.day01;
import java.util.ArrayList;
import java.util.Scanner;
public class Student {

	// Array List
	ArrayList <String> studCourses= new ArrayList<String>();

	String name;
	String grade;
	
	Student(String name, String grade){
		this.name = name;
		this.grade = grade;
		this.studCourses = new ArrayList <String>();
	}
	
	
	public void addCourses(String course) {
		
		studCourses.add(course);
	}
	
	public void removeCourses(String studCourse){
		
		studCourses.remove(studCourse);
	}
	
	public void display() {
		System.out.println("Enter Student Name: " + name);
		System.out.println("Enter Student Grade: " + grade);
		System.out.println("Enter Course name: " + studCourses);
	}
	
	public static void main(String[] args) {
		
		Student student1= new Student("Jeyandhan","A");
		
		System.out.println("\n\tAdding Course\n");
		student1.addCourses("Maths");
		student1.addCourses("Tamil");
		student1.display();
		
		
		Student student2= new Student("Mahesh","A");
		
		System.out.println("\n\tAdding Course\n");
		student2.addCourses("Science");
		student2.addCourses("English");
		student2.display();
		
		System.out.println("\n\tRemoving Course\n");
		student1.removeCourses("Maths");
		student1.display();
		
		System.out.println("\n\tRemoving Course\n");
		student2.removeCourses("English");
		student1.display();
	}

	}

