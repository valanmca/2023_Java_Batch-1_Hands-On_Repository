package com.dharshu.day5;

import java.util.Scanner;
import java.util.TreeMap;

public class FactorialMap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		// total no.o input is 10 'n' depends the number from 1to 10
		for (int n = 1; n <= 10; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			tm.put(n, fact);
		}
		System.out.println(tm);
		boolean bool = false;
		System.out.println("Enter the particular number to get the factorial:");
		int num1 = sc.nextInt();
		for (int i = 0; i < num1; i++) {
			if (num1 == i) {
				bool = true;
				break;}
			 else 
				bool = false;
			
		}
		if (bool = true)

			System.out.println("The Factorial of" + num1 + "is:" + tm.get(num1));

		else
			System.out.println("No num found");
	}
}
