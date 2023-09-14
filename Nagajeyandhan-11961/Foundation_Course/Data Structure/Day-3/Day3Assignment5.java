//Pattern using one loop

package com.jeyandhan.day03;

import java.util.Scanner;

public class Day3Assignment5 {

	public static void main(String[] args) {
		String str = "";
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		value = sc.nextInt();
		System.out.println("The reult is...");
		for (int i = 0; i < value; i++) {
			str = str + "*";
			System.out.println(str);
		}

	}

}
