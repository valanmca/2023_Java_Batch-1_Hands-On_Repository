/**** Java program to find the factorial of the given number*****/
package com.sara.CoreJava.Day_02;

import java.util.Scanner;

public class Assignment_05 {

	public static void main(String[] args) {

		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);

		int Number = sc.nextInt();
		int fact = 1;

		for (int i = 1; i < Number + 1; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}
