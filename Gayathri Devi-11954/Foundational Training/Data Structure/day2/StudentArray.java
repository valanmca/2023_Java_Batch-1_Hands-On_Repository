package com.gayathri.day2;

import java.util.Scanner;//Scanner is predefined class in util package
public class StudentArray {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		//in is the standered input stream in java.lang.system.in package
		
		System.out.println("Enter student id : ");
		int stdId = sc.nextInt();
		System.out.println("Enter student name : ");
		String stdName = sc.next();
		// String is a predefined class in java
		// int is a primitive data type as well as keyword
		
		System.out.println("Enter student mark : ");
		int marks[]=new int[3];
		for(int i=0; i<marks.length; i++)
		{
			marks[i]=sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<marks.length; i++)
		{
			sum = sum + marks[i];
		}
		
		int avg = sum / marks.length;
		
		//System--- is a class it is in lang package
		// out--- is printstream class also in lang package
		//println ---- is printstream class method ---void java.io.PrintStream.println(String x)
		sc.close();
		System.out.println("Student Name 	: " +stdName);
		System.out.println("Student ID	 : " +stdId);
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Mark "+(i+1)+ " : " + marks[i] );		
		}
		System.out.println("Total Mark 	: " +sum);
		System.out.println("Average Mark	: " +avg);
	}

}