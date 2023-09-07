package com.madhan.day01;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		System.out.println("Enter the values:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digits;
		int sum=0;
		while(n!=0)
		{
			digits=n%10;
			sum=sum+digits;
			n=n/10;
			
		}
		System.out.println("sum of the digits are:"+sum);
	}

}
