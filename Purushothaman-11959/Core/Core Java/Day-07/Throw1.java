package com.purushoth.day_07;

import java.util.Scanner;

class InvalidAgeException extends Exception{

	@Override
	public String toString() {
		return "Invalid Age for Vote";
	}	
}
public class Throw1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if(age>18) {
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
