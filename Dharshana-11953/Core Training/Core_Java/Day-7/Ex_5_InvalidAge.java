package com.dharshu.day7;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	@Override
	public String toString() {
		return "Invalid Age for Voting";
	}
}


public class Ex_5_InvalidAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age:");
		int age = new Scanner(System.in).nextInt();
		if (age > 18) {
			System.out.println("Welcome to Voting");
		} else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}

	}

}
