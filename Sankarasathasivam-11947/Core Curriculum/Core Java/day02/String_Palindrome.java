package com.shiva.core.day02;
import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Value");
		String s1=sc.next();
		
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		
		String data=sb.toString();
		if(s1.equals(data))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not an palindrome");
		}
	}

}
