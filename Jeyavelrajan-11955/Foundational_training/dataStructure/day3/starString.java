package com.jeyavel.day3;
import java.util.Scanner;
public class starString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		int ele = sc.nextInt();
		
		String star = "";//string is a predefined class
		for(int input=0;input<=ele;input++) {
			 star=star+"*";
			 System.out.println("the output is"+star);
		}
		

	}

}
