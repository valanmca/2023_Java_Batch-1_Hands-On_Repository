package com.aravind.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to reverse and check it is palindrome =");
		int n = sc.nextInt();
		int check = n;

		int rem;
		int rev = 0;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;

		}
		System.out.println("After reverse the no=");
		System.out.println(rev);
		if (check == rev) {
			System.out.println("Given no is palindrome ");
		} else {
			System.out.println("Given no is not a palindrome ");
		}

	}

}
