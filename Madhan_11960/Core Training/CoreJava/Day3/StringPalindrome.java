package com.madhan.coreday3;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String word=sc.next();
		System.out.println(word);
		
		StringBuffer sb=new StringBuffer(word);
		sb.reverse();
		System.out.println(sb);
		String data=sb.toString();
		if(word.equalsIgnoreCase(data))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	

}
