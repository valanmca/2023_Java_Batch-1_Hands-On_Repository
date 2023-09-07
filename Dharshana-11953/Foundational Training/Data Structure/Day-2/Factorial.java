package com.dharshu.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		
		int i,fact=1;
		
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of"+number+"is:"+fact);

	}

}
