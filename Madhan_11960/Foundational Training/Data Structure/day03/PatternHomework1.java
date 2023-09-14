/*  pattern programs 
	   (using only one for loop)*/

package com.madhan.day03;

import java.util.Scanner;

public class PatternHomework1 {

	public static void main(String[] args) {

		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		int i, j = 0;

		for (i = 1; i <= value;) {
			if (j < i) {
				System.out.print("*");
				j++;
				continue;
			}
			if (j == i) {
				System.out.print(" ");
				j = 0;
				i++;
			}
			System.out.println();
		}
	}

}
