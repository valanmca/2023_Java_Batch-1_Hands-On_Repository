package com.gayathri.day1;
/*
 * 1. Write a Java program to create a class called "name" with a name, grade, and courses attributes, 

 * and methods to add and remove courses.
 */

import java.util.LinkedList;
import java.util.Scanner;

class name{
	Scanner sc = new Scanner(System.in);
	String name, grade, course;
	String rmname, rmgrade, rmcourse;
	

	LinkedList<String> nameList = new LinkedList<String>();
	LinkedList<String> gradeList = new LinkedList<String>();
	LinkedList<String> courseList = new LinkedList<String>();

	public void removeDetails() {
		System.out.println("\nEnter name to be remove : ");
		rmname = sc.nextLine();
		for (int i = 0; i < nameList.size(); i++) {
			rmname.equals(nameList.get(i));
		}
		nameList.remove(rmname);
		System.out.println("Enter grade to be remove : ");
		rmgrade = sc.nextLine();
		for (int j = 0; j < gradeList.size(); j++) {
			rmgrade.equals(gradeList.get(j));
		}
		gradeList.remove(rmgrade);
		System.out.print("\nEnter course to be remove : ");
		rmcourse = sc.nextLine();
		for (int k = 0; k < courseList.size(); k++) {
			rmcourse.equals(courseList.get(k));
		}
		nameList.remove(rmname);
		gradeList.remove(rmgrade);
		courseList.remove(rmcourse);

		System.out.print("\n Record was removed Successfully.");
	}

	public void addDetails() {
		System.out.print("\nEnter name : ");
		name = sc.nextLine();
		nameList.add(name);
		System.out.print("\nEnter grade : ");
		grade = sc.nextLine();
		gradeList.add(grade);
		System.out.print("\nEnter course : ");
		course = sc.nextLine();
		courseList.add(course);
		System.out.print("\n Record was added Successfully.");
	}
	public void display() {
		System.out.println("\nName : "+nameList);
		System.out.println("Grade : "+gradeList);
		System.out.println("Course : "+courseList);
		
	}

}
public class LabEx1StudentClass {

	public static void main(String[] args) {
		name obj = new name();
		//obj.display();		
		obj.addDetails();obj.display();obj.removeDetails();obj.display();

	}

}

