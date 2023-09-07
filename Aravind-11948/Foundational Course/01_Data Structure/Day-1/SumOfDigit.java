package com.aravind.day1;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sum = 0;
		int rem;
		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;// sum+=rem;
			n = n / 10;

		}
		System.out.println(sum);

	}

}
