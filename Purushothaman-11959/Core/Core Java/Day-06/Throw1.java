package com.purushoth.day_06;

import java.util.Scanner;
public class Throw1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		
		//Give access to vote.
		
		if(age<18) {
			throw new ArithmeticException("Access Denied");
		}
		else {
			System.out.println("Access approved");
		}

	}

}
