package com.purushoth.day1;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int add, sub, multiply, divide;
		add = a + b;
		sub = a - b;
		multiply = a * b;
		divide = a / b;
		System.out.println("Add: " + add);
		System.out.println("Subtract: " + sub);
		System.out.println("Multiply: " + multiply);
		System.out.println("Divide: " + divide);
		
	}

}
