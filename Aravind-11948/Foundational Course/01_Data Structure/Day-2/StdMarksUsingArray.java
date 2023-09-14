package com.aravind.day2;

import java.util.Scanner;

public class StdMarksUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student Id=");
		int sId = sc.nextInt();
		System.out.println("Enter the student Name=");
		String sName = sc.next();
		System.out.println("Enter the three Mark in the array=");
		int marks[] = new int[3];

		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		/*
		 * int m1=sc.nextInt(); int m2=sc.nextInt(); int m3=sc.nextInt(); int
		 * sum=m1+m2+m3;
		 */
		int avg = sum / 3;

		System.out.println("student Id :" + sId);
		System.out.println("student Name :" + sName);
		/*
		 * System.out.println("student Mark 1 :"+ m1);
		 * System.out.println("student Mark 2 :"+ m2);
		 * System.out.println("student Mark 3 :"+ m3);
		 */
		for (int i = 0; i < marks.length; i++) {
			System.out.println("mark " + (i + 1) + ":" + marks[i]);
		}
		System.out.println("Total mark :" + sum);
		System.out.println("Average Mark:" + avg);

	}

}
