package com.jeban.JavaArray;

public class Palindrome {

	public static void main(String[] args) {
		String s1="Hello";
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		String s3=s2.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s3));
		if (s1.equals(s3)) {
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not a Polindrome");
		}

	}

}
