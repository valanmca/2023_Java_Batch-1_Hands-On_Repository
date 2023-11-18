package com.jeyandhan.day08;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	@Override
	public String toString() {
		
		return "Invalid Age to Vote";
	}
}

public class CustomException {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the age: ");
		int age  = new Scanner(System.in).nextInt();
		
		if(age > 18) {
			System.out.println("Welcome to vote");
		}else {
			try {
				throw new InvalidAgeException();
			}catch(InvalidAgeException e) {
				System.err.println(e);
			}
			
		}
		
		
	}

}
