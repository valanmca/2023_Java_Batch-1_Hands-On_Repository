/****** Pattern Printing by Using Only One Loop... ******/
package com.sara.day03;

import java.util.Scanner;

public class Pattern_Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String star = "";
		System.out.println("Enter the value : ");
		int value = sc.nextInt();
		for (int i = 0; i < value; i++) {
			star += "*";
			System.out.println(star);
		}
	}

}
