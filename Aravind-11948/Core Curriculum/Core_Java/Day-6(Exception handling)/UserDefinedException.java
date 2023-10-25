package com.core.day_06_;
import java.util.Scanner;

class InvalidAgeException extends Exception{

	@Override
	public String toString() {
		return "Invalid Age for vote";
	}
	
}

public class UserDefinedException {

	public static void main(String[] args) {
		System.out.println("Enter you Age");
		int age=new Scanner (System.in).nextInt();
		
		if (age>18)
		{
			System.out.println("Welcome to vote");
		}
		else {
			try 
			{
				throw new InvalidAgeException();
			}
//			catch (InvalidAgeException e) {  // catch exception
//				System.out.println(e);
//			}
			catch (Throwable e) { // catch throwable
				System.out.println(e);
			}
		}
		

	}

}
