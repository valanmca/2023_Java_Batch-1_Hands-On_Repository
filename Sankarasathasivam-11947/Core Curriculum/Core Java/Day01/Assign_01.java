
//Write a java program to find the sum of first 10 prime numbers
package com.shiva.core.day01;

public class Assign_01 {

	public static void main(String[] args) {
		int n = 0, i = 1, j;
		int sum = 0;

		while (n < 10) {
			int count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum = sum + i;
				n++;
			}
			i++;
		}
		System.out.println("The Sum of Prime Numbers " + sum);
	}
}
