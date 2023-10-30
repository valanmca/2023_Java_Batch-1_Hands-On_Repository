/*** Example for User Defined Exception ***/
package com.sara.CoreJava.Day_08;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public String toString() {
		return "Invalid Age for Vote";
	}
}

public class ExceptionHandling_Ex07 {

	public static void main(String[] args) {
		System.out.println("Enter your Age : ");
		int age = new Scanner(System.in).nextInt();
		if (age >= 18) {
			System.out.println(" Welcome to vote ");
		} else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}
}
