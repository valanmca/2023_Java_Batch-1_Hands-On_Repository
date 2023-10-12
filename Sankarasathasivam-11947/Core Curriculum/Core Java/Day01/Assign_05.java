
//Write a Java program to find the factorial of the given number

package com.shiva.core.day01;

import java.util.Scanner;

public class Assign_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=number;i++) 
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
