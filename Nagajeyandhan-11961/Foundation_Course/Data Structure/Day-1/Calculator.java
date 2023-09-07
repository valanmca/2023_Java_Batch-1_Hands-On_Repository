//Simple Calculator

package com.jeyandhan.day01;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("\t Arithmetic Operations");
		System.out.println("\nEnter the First number: ");
		a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		b=sc.nextInt();
		System.out.println("The Addition of given number is: "+ (a+b));
		System.out.println("\nThe Subtraction of given number is: "+ (a-b));
		System.out.println("\nThe Multiplication of given number is: "+ a*b);
		System.out.println("\nThe Division of given number is: "+ a/b);
		
	}

}
