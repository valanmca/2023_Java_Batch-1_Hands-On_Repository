
//Write the program to find the sum of digits of a given number

package com.shiva.core.day01;

import java.util.Scanner;

public class Assign_02 {

	public static void main(String[] args) {
		int number, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		number = sc.nextInt();
		int n = number;
		while (number > 0) {
			digit = number % 10;  //276-->(276 % 10)= 6
			sum = sum + digit;    //sum = 0 + 6 
			number = number / 10; // (276/10)=27
		}
		System.out.println("The Sum of the digit " + n + " : " + sum);
	}

}
