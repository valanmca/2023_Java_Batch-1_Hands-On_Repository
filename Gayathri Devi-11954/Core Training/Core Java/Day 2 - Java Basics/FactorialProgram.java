package com.gayathri.day2;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		int num;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for factorial calculation : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" : " +fact);
		sc.close();
	}

}
