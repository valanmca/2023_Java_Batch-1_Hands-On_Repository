package com.aravind.day1;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to reverse=");
		int n = sc.nextInt();

		int rem;
		int rev = 0;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;

		}
		System.out.println("After reverse the no=");
		System.out.println(rev);

	}

}
