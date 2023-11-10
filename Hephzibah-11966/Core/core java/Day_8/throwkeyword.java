package Day_8;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public STring toString() {
		return "Invalid Age for vote";l
				}
}

public class throwkeyword {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		int age = new SCanner(System.in).nextInt();
		
		if(age>18) {
			System.out.println("Welcome to Vote");
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
