package com.mahesh.Oops_day9;

import java.util.Scanner;

public class Numeric_Actions {

	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;

		}
		System.out.println("Factorial value is :" + fact);
	}

	static void digitcount(int n) {
		int count = 0;
		if(n==0)
		{
			count=1;
		}
		while (n != 0) {
			n = n / 10;
			count++; // count=count+1;
		}
		System.out.println("Digit Count is: " + count);
	}

	public static void main(String[] args) {

		Numeric_Actions obj = new Numeric_Actions();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number for factorial : ");
		int number=sc.nextInt();
		obj.factorial(number);
		System.out.println("Enter any number for digitcount : ");
		int digit=sc.nextInt();
		Numeric_Actions.digitcount(digit);

	}

}
