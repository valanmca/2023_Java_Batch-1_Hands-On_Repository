package com.madhan.coreday2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner digit=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=digit.nextInt();
		int fact=1;
		
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial  is :"+fact);

	}

}
