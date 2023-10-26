/***** Java program to find the biggest of the given three
numbers using Command Line Arguments *****/

package com.sara.CoreJava.Day_02;

public class Assignment_06 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if (a > b && a > c) {
			System.out.println(a);
		}

		else if (b > a && b > c) {
			System.out.println(b);
		}

		else {
			System.out.println(c);
		}

	}

}
