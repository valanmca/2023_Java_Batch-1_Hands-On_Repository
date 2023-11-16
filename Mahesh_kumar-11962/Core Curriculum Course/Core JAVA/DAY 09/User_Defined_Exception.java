package com.mahesh.core_java_day_09;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public String toString() {

		return "Invalid Age for Voting";
	}

}

public class User_Defined_Exception {

	public static void main(String[] args) {

		System.out.println("Enter the User age : ");
		int age = new Scanner(System.in).nextInt();
		if (age > 18) {
			System.out.println("Ur eligible for voting");
		} else {
			try {
				throw new InvalidAgeException();

			} catch (Exception e) {
				System.out.println(e);
			}

			/*
			 * catch(InvalidAgeException e) { System.out.println(e); Both are same }
			 */

		}

	}

}
