//Write a Java program to find the sum of the first 10 prime numbers.
package oopsDay1_Day2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int count = 0;
		
		int c=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 2; c < n; i++) {
			count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}
				

			}
			if (count == 1) {
				sum = sum + i;
				c++;
				System.out.println(i);
			}

		}
		System.out.println("The sum of prime numbers are : "+ sum);
	}
}
