package com.naveen.day6;
// Custom Exception in JAVA

import java.util.Scanner;

class InvalidAgeException extends Exception {
	@Override
	public String toString() { // It will override the default error message to user defined
		return "Invalid Age for Vote";
	}

}

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		if (age > 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}

}
