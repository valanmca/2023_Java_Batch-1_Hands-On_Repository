/****Counting The Number Of Digits in the Given Number(DigitCount)...S****/
package com.sara.day01;

import java.util.*;

public class DigitCount {

	public static void main(String[] args) {
		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;

		}
		System.out.println("The Number of Digits is : " + count);
	}

}
