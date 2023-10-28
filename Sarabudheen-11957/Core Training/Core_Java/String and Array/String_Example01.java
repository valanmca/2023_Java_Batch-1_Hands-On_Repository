//Java StringBuffer Example
package com.sara.CoreJava.Day_03;

public class String_Example01 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");

		String s3 = "java";
		String s4 = "java";

		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");

		System.out.println(s1.equals(s2));// True

		System.out.println(s1 == s2);// False

		System.out.println(s3.equals(s4));// true

		System.out.println(s3 == s4);// true

		System.out.println(sb1.equals(sb2));// False

		System.out.println(sb1 == sb2);// False
	}

}
