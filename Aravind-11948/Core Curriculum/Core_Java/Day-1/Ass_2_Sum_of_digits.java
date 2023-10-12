package com.core.day_01;

import java.util.Scanner;

public class Ass_2_Sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number, digit, sum = 0;

		System.out.println("Enter the Number : ");
		number = sc.nextInt();
		int n = number;
		while (number > 0) {
			digit = number % 10; // 276-->(276 % 10)= 6
			sum = sum + digit; // sum = 0 + 6
			number = number / 10; // (276/10)=27
		}
		System.out.println("The Sum of the digit " + n + " : " + sum);

	}

}
