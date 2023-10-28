/*******java program to print the pattern******/

package com.sara.CoreJava.Day_02;

import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
