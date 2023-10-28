package com.shiva.core.day08;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	@Override
	public String toString() {
		return "Invalid Age for Voting";
	}
}

public class Except_04 {

	public static void main(String[] args) {
		System.out.println("Enter your age : ");
		
		int age=new Scanner(System.in).nextInt();
		
		if(age>18) {
			System.out.println("Welcome to Voting");
		}
		else {
			try {
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}

	}

}
