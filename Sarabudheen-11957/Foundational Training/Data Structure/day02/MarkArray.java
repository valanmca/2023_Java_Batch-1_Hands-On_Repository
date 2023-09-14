/***** Getting Marks ,Calculate Sum and Average Using Array... ******/
package com.sara.day02;

import java.util.Scanner;

public class MarkArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[3];
		System.out.println("Enter Student Id : ");
		int sId = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sName = sc.next();
		System.out.println("Enter Three Subject Marks : ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		int avg = sum / 3;
		System.out.println("Student Id : " + sId);
		System.out.println("Student Name : " + sName);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark" + (i + 1) + ":" + marks[i]);
		}
		System.out.println("Total Mark: " + sum);
		System.out.println("Average Mark : " + avg);

	}

}
