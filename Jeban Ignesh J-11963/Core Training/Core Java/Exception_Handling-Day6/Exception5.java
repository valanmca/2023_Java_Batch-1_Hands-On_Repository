package com.jeban.Exception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public String toString() {
		return "Not Eligible for voting";
	}
	
}

public class Exception5 {

	public static void main(String[] args) {
		System.out.println("Enter your Age:");
		Scanner sc=new Scanner (System.in);
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Eligible for voting");
		}
		else {
			try {
				throw new InvalidAgeException();
			}catch(InvalidAgeException e) {
				System.out.println(e);
			}
			
		}

	}

}
