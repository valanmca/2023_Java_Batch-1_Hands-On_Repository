package com.jenish.day1;

import java.util.Scanner;

public class Ex05_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
