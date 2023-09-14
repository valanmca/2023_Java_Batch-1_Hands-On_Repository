/******************  Calculator...  ***********************/
package com.sara.day01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int n2 = sc.nextInt();

		int add = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		int mod = n1 % n2;

		System.out.println("The Addition of Two Numbers is : " + add);
		System.out.println("The Subraction of Two Numbers is : " + sub);
		System.out.println("The Multiplication of Two Numbers is : " + mul);
		System.out.println("The Division of Two Numbers is : " + div);
		System.out.println("The Modulation of Two Numbers is : " + mod);
	}

}
