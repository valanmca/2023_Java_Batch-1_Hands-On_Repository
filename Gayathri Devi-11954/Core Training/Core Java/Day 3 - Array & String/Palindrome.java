package com.gayathri.day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a String : ");
		String s1 = sc.next();
		
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer s2 = sb.reverse();
		
		String s3 = s2.toString();
		
		if(s1.equals(s3))
			System.out.println("Yes Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
		
	

	}

}
