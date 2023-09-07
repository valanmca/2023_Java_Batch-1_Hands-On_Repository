package com.shaji.Day01;

import java.util.Scanner;

public class Digits_calulation {

	public static void main(String[] args) { // Finding Number of Digits
		System.out.println("Enter the Numbers : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		sc.close();
		while(number!=0) {
			number/=10;
			count++;
		}
		System.out.println("Number of Digits: " + count);
	}

}
