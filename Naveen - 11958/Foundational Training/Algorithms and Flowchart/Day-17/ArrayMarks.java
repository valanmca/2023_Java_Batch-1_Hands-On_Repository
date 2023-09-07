package com.naveen.day17;

import java.util.Scanner;

public class ArrayMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		int sId = sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sName = sc.next();
		
		System.out.println("Enter the Student Marks");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		sc.close();
		
		int sum=m1+m2+m3;
		int avg=sum/3;
		
		System.out.println("Student Id : "+sId);
		System.out.println("Student Name: "+sName);
		System.out.println("Student Mark 1 : "+m1);
		System.out.println("Student Mark 2 : "+m2);
		System.out.println("Student Mark 3 : "+m3);
		System.out.println("Total Marks : "+sum);
		System.out.println("Average Marks : "+avg);

	}

}
