package com.naveen.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float n1,n2,sum,sub,mul,div,mod;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		n1 = sc.nextFloat();
		
		System.out.println("Enter the Second Number: ");
		n2 = sc.nextFloat();
		
		sum = n1+n2;
		sub = n1-n2;
		mul = n1*n2;
		div = n1/n2;
		mod = n1%n2;
		
		
		System.out.println("Addition : "+sum);
		System.out.println("Subtraction :"+sub);
		System.out.println("Multiplication : "+mul);
		System.out.println("Division : "+div);
		System.out.println("Modulus : "+mod);
		
		sc.close();
		

	}

}