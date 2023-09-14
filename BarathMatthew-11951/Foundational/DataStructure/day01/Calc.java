package com.matthew.day01;
import java.util.Scanner;
public class Calc {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println("Sum of two numbers :" + (num1+num2));
		System.out.println("Subtration of two numbers :" + (num1-num2));
		System.out.println("Multiplication of two numbers :" + (num1*num2));
		System.out.println("Divition of two numbers :" + (num1/num2));
		System.out.println("Modulo of two numbers :" + (num1%num2));
	} 
}
