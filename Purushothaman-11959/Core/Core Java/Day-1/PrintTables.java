package com.purushoth.day_01;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the tables: ");
		int size=sc.nextInt();
		System.out.println("Number to multiply: ");
		int b = sc.nextInt();
		int multiply;
		for (int i=1;i<size;i++) {
		multiply = i * b;
		System.out.println(i+"*"+b+"="+multiply);
		}
	}
}//3. Write a Java program to print tables of the given number.//Eg : if the given number is 5 //1 * 5 = 5
