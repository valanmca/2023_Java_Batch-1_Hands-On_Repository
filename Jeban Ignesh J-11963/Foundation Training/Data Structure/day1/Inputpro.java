package com.jeban.day1;

import java.util.*;

public class Inputpro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id");
		int sId = sc.nextInt();

		System.out.println("Enter Student Name");
		String sName = sc.next();

		System.out.println("Enter Three Student Marks");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();

		System.out.println("Sum of the Students");
		int sum = sc.nextInt();

		int avg = sum / 3;
		System.out.println("Student Id:" + sId);
		System.out.println("Student Nmae:" + sName);
		System.out.println("Student Mark1:" + m1);
		System.out.println("Student Mark2:" + m2);
		System.out.println("Student Mark3:" + m3);
		System.out.println("Total Marks:" + sum);
		System.out.println("Average Marks :" + avg);
	}

}
