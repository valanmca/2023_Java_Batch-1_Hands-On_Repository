package com.aravind.day3;

import java.util.*;

public class PatternHw {

	public static void main(String[] args) {
		/*
		 * 
		 * * ** *** **** ***** use only one loop
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int iindex = 1;
		int star = 0;
		for (iindex = 1; iindex <= n;) {

			if (star < iindex) {
				System.out.print("* ");
				star++;
				// continue;
			}
			if (star == iindex) {
				System.out.println();
				iindex++;
				star = 0;

			}

		}
	}
}
