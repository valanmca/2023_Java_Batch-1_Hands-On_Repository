//Pattern printing
package com.matthew.day03;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Getting input
		System.out.println("Enter the Value : ");
		int num = sc.nextInt();
		// creating an empty string
		String store = "";
		String symbol = "*";
		int count = 0;
		for (int i = 1; i <= num; i++) {
			count++;
			store += symbol;
			if (count == i) {
				count = 0;
				System.out.println(store);
				store="";
			} else {
				i = i - 1;
			}
		}
	}

}
