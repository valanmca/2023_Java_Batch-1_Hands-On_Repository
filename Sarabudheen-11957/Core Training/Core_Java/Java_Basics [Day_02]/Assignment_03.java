/***** Java program to print tables of the given number *****/
package com.sara.CoreJava.Day_02;

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " * " + num + " = " + (i * num));
		}

	}

}
