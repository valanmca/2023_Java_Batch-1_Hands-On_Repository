package com.shaji.Day01;

import java.util.Scanner;

public class Stud_Detail2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		int sID = sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sName = sc.next();
		
		System.out.println("Enter three Subject Marks");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int sum = m1 + m2 +m3;
		int avg = sum / 3;
		System.out.println("Student ID : " + sID);
		System.out.println("Student Name : " + sName);
		System.out.println("Student Mark 1 : " + m1);
		System.out.println("Student Mark 2 : " + m2);
		System.out.println("Student Mark 3 : " + m3);
		System.out.println("Total Marks : " + sum);
		System.out.println("Average Marks : " + avg);

	}

}
