package com.swetha.day1;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		int sum=a1+a2;
		int sub=a1-a2;
		int mul=a1*a2;
		float div=a1/a2;
		
		System.out.println("The sum of two numbers are :"+sum);
		System.out.println("The difference of two numbers are :"+sub);
		System.out.println("The Product of two numbers are :"+mul);
		System.out.println("The Division of two numbers are :"+div);

	}

}
