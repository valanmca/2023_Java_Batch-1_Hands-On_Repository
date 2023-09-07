package com.gayathri.day1;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		int count=0;		
		while(number>0)
		{
			number = number/10;
			count++;
		}		
		System.out.println("No.of.digits in a given number : " +count);

	}

}
