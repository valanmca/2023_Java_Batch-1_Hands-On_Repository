package com.shaji.Day01;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) { //Calculation with Add, sub, mul, and divide
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value1");
		float v1 = sc.nextFloat();
		
		System.out.println("Enter value2");
		float v2 = sc.nextFloat();
		
		float sum = v1 + v2;
		float sub = v1 - v2;
		float mul = v1 * v2;
		float div = v1 / v2;
		
		System.out.println("Value of Addition : " + sum);
		System.out.println("Value of Subtraction : " + sub);
		System.out.println("Value of Multiplication : " + mul);
		System.out.println("Value of Division : " + div);
	}

}
