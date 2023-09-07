package com.shaji.Day02;

import java.util.Scanner;

public class Mark_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int marks[] = new int[3];
		
		System.out.println("Enter Student Id");
		int sID = sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sName = sc.next();
		
		System.out.println("Enter three Subject Marks");
		for (int i=0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for (int i=0; i<marks.length; i++) {
			sum = sum + marks[i];
		}
		int avg = sum / 3;
		System.out.println("Student ID : " + sID);
		System.out.println("Student Name : " + sName);
		for (int i=0; i<marks.length; i++) {
			System.out.println("Mark " + (i+1) + ":" + marks[i]); 
		}
		System.out.println("Total Marks : " + sum);
		System.out.println("Average Marks : " + avg);
	}

}
