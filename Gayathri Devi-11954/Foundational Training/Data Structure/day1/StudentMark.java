package com.gayathri.day1;

import java.util.Scanner;
public class StudentMark {

	public static void main(String[] args) {

		//Scanner is predefined class in util package
		Scanner sc = new Scanner(System.in);
		//in is the standered input stream in java.lang.system.in package
		
		System.out.println("Enter student id : ");
		int stdId = sc.nextInt();
		System.out.println("Enter student name : ");
		String stdName = sc.next();
		// String is a predefined class in java
		// int is a primitive data type as well as keyword
		System.out.println("Enter student mark : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int sum = m1+m2+m3;
		int avg = sum / 3;
		
		//System--- is a class it is in lang package
		// out--- is printstream class also in lang package
		//println ---- is printstream class method ---void java.io.PrintStream.println(String x)
		
		System.out.println("Student Name 	: " +stdName);
		System.out.println("Student ID	 : " +stdId);
		System.out.println("Student Mark1	: " +m1);
		System.out.println("Student Mark2	: " +m2);
		System.out.println("Student Mark3	: " +m3);
		System.out.println("Total Mark 	: " +sum);
		System.out.println("Average Mark	: " +avg);
	}

}
