package com.shiva.day01;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Value : ");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second Value : ");
		int b=sc.nextInt();
		
		System.out.println("Addition of A+B is : "+(a+b));
		//System.out.println(a+b);
		System.out.println("Subtraction of A-B : "+(a-b));
		//System.out.println(a-b);
		System.out.println("Multiplication of A*B : "+a*b);
		//System.out.println(a*b);
		System.out.println("Division of A/B : "+a/b);
		//System.out.println(a/b);
		
		//System.out.println("Addition "+(a+b)+" \nSubtraction "+(a-b)+" \nMultiplication "+(a*b)+" \nDivision "+(a/b));
	}

}
