package com.purushoth.day_01;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
        while(num>0) {
        	int digit=num%10;
        	sum=sum+digit;
        	num=num/10;
        }
        System.out.println("Sum of Digits: "+sum);
	}

}//2. Write a Java program to find the sum of digits of the given number.
