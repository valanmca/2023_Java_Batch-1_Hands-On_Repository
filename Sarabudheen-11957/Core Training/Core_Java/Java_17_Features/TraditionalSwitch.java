//Example for Tradition Switch Statement
package com.sara.CoreJava.Day_17;

import java.util.Scanner;

public class TraditionalSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		int n = sc.nextInt();
		String num = "";
		
		switch (n) {
		case 1:
			num = "One";
			break;
		case 2:
			num = "Two";
			break;
		case 3:
			num = "Three";
			break;
		default:
			num = "Invalid";

		}
		System.out.println(num);

	}

}
