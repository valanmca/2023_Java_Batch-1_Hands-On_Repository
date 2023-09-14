package com.domnic.day1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the First Value");
		int n1=sc.nextInt();
		System.out.println("Enter the Second Value");
		int n2=sc.nextInt();
		
//		int add=n1+n2;
//		int sub=n1-n2;
//		int mul=n1*n2;
//		int div=n1/n2;
		
		System.out.println("Addition of two numbers :"+ (n1+n2));
		System.out.println("Subtraction of two numbers :"+ (n1-n2));
		System.out.println("Multiplication of two numbers :"+ (n1*n2));
		System.out.println("Division of two numbers :"+ (n1/n2));
		
	
	}

}
