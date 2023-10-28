/***** Java program to find the sum of digits of the given number*****/
package com.sara.CoreJava.Day_02;

import java.util.Scanner;

public class Assignment_02 {

	public static void main(String[] args) {
		int number,rem,sum = 0;

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();

		while (number > 0) {

			rem = number % 10;

			sum = +rem;

			number /= 10;

		}

		System.out.println("Sum of Digit is " + sum);
	}

}
