package com.gayathri.day8Exception;

import java.util.Scanner;
class InvalidAgeException extends Exception{
	
	public String toString() {
		return "Not Valid";
	}
}
public class SampleCustomException12 {

	public static void main(String[] args) {
		System.out.println("Enter your age : ");
		int age = new Scanner(System.in).nextInt();
		
		if(age>18)
			System.out.println("Valid");
		else{
			try {
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}
		
	}

}