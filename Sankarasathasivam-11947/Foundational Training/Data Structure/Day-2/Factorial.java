package com.shiva.day02;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact= fact*i;
			System.out.print(i+"*");
		}
		System.out.println(" = "+fact);

	}

}
