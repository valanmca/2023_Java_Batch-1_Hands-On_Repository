package com.jeyavel.coreDay6;
import java.util.Scanner;

 @SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    @Override
	public String toString() {// used to convert a given string ouput into other developer defined format 
    	return "Invalid Age for vote";
    }
}


public class ExceptionhandlingThrowD2Exno6 {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age = new Scanner(System.in).nextInt();

		if(age>18) {
			System.out.println("Welcome to vote");
		}else {
			try {
				throw new InvalidAgeException();
				
			}catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}

}
