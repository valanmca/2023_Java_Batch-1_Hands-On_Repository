/****** Factorial of Given Number... ******/
package com.sara.day02;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		int fact = 1;
		for (int i = 1; i < Number + 1; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
