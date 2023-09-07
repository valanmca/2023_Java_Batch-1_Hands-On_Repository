//Take the input from the User in java
package com.pravinkumar.day1;
import java.util.Scanner;

public class Array_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id:");
		int sId= sc.nextInt();
		
		System.out.println("Enter the Student Name:");
		String sName= sc.next();
		
		System.out.println("Enter the Three subject Marks:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int sum = m1+m2+m3;
		int avg = sum / 3;
		
		System.out.println("Student Id:" + sId);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Mark1:" + m1);
		System.out.println("Student Mark2:" + m2);
		System.out.println("Student Mark3:" + m3);
		System.out.println("Total Marks:" + sum);
		System.out.println("Average Marks:" + avg);
	}

}
