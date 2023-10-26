//Palindrome using Java String
package com.sara.CoreJava.Day_03;

public class String_Example02 {

	public static void main(String[] args) {
		String s1 = new String("madam");

		StringBuffer s2 = new StringBuffer(s1);
		String s3 = new String(s2.reverse());

		System.out.println("Original String : " + s1);
		System.out.println("Reversed String : " + s3);
		System.out.println(s1.equals(s3));

	}

}
