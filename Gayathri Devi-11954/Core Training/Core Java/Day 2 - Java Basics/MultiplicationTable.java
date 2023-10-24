package com.gayathri.day2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number;
		int limit;
		int ans;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a table : ");
		number = sc.nextInt();
		System.out.print("Enter a limit : ");
		limit = sc.nextInt();

		for (int i = 0; i <= limit; i++) {
			ans = number * i;
			System.out.println(i + " * " + number + " = " + ans);
		}
		sc.close();
	}
}
