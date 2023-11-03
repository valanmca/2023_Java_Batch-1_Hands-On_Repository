package com.naveen.day2;
/*Java program to check palindrome or not without using the loop*/
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		
		String s2 = sb.toString();
		
		if(s1.equals(s2)) {
			System.out.println("Giving string is a Palindrome");
		}
		else {
			System.out.println("Giving string is not a Palindrome");
		}
	}

}
