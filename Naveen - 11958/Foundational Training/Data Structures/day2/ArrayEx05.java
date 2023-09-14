package com.naveen.day2;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int marks[]=new int[3];
		System.out.println("Enter Student Id");
		int sId = sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sName = sc.next();
		
		System.out.println("Enter the Three Subject Marks");
		for(int i=0;i<marks.length;i++) {
			marks[i] = sc.nextInt();
		}
		
		sc.close();
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		int avg=sum/3;
		
		System.out.println("Student Id : "+sId);
		System.out.println("Student Name: "+sName);
		for(int i=0;i<marks.length;i++) {
			System.out.println("Mark "+(i+1)+" : "+marks[i]);	
		}
		System.out.println("Total Marks : "+sum);
		System.out.println("Average Marks : "+avg);

	}

}


/* For reducing the usage of several variables we can able to 
   implement the array and get the input using for loop also we can perform sum*/
