package com.madhan.coreday2;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		int digit,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the digits:");
		int number=sc.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("Sum of the digits are :"+sum);
	}
	

}
