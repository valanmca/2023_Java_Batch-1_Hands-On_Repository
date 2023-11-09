package com.jeyavel.coreDay6;
//throw Example
import java.util.Scanner;
public class ExceptionHandlingExno3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person Age");
		 	int age = sc.nextInt();
		 	if(age<18) {
		 		
		 		throw new ArithmeticException("Person is not eligible ");
		 		
		 	}
		 	else {
		 		System.out.println("Person is eligible");
		 	}
		

	}

}
