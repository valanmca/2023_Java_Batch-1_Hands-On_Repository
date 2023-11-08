package com.gayathri.day16Java11Features;

public class P1SIsBlank {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "    ";
		String s3 = "String";

		System.out.println("s1 is blank ? : " + s1.isBlank());
		System.out.println("s2 is blank ? : " + s2.isBlank());
		System.out.println("s3 is blank ? : " + s3.isBlank());
	}
}
