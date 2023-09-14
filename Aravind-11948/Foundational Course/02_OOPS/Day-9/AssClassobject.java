package com.aravind.day9;

import java.util.Scanner;

public class AssClassobject {

	void factorial(int n)

	{

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

	static void digitCount(int n) {
		int count = 0;
		while (n != 0) {
			count = count + 1;
			n = n / 10;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AssClassobject obj = new AssClassobject();
		System.out.println("enter the no to find factorial");
		int fact = sc.nextInt();

		obj.factorial(fact);

		System.out.println("enter the no to find digit");

		int no = sc.nextInt();
		AssClassobject.digitCount(no);

	}

}
