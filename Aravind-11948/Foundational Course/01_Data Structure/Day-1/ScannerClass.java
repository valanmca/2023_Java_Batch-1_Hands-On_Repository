package com.aravind.day1;

import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		// using scanner class to make an program dynamic

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student Id=");
		int sId = sc.nextInt();
		System.out.println("Enter the student Name=");
		String sName = sc.next();
		System.out.println("Enter the three  student Mark=");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int sum = m1 + m2 + m3;
		int avg = sum / 3;

		System.out.println("student Id :" + sId);
		System.out.println("student Name :" + sName);
		System.out.println("student Mark 1 :" + m1);
		System.out.println("student Mark 2 :" + m2);
		System.out.println("student Mark 3 :" + m3);
		System.out.println("Total mark :" + sum);
		System.out.println("Average Mark:" + avg);

	}

}
