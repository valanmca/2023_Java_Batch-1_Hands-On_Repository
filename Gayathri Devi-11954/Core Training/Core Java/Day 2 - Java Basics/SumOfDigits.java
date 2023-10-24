package com.gayathri.day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int digit = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int originalnumber = number;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("\n Sum of " + originalnumber + " : " + sum);
		sc.close();
	}
}

