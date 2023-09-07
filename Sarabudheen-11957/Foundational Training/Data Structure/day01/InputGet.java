/****** Getting Inputs from the User... ******/
package com.sara.day01;

import java.util.Scanner;

public class InputGet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int sId = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sName = sc.next();
		System.out.println("Enter Three Subject Marks : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int sum = m1 + m2 + m3;
		int avg = sum / 3;
		System.out.println("Student Id : " + sId);
		System.out.println("Student Name : " + sName);
		System.out.println("Student Mark1 : " + m1);
		System.out.println("Student Mark2 : " + m2);
		System.out.println("Student Mark3 : " + m3);
		System.out.println("Total Mark: " + sum);
		System.out.println("Average Mark : " + avg);
	}

}
