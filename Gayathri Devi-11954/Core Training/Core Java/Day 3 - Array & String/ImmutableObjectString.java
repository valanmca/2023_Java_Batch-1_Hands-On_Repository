package com.gayathri.day3;

public class ImmutableObjectString {

	public static void main(String[] args) {
	
		String s1 = "java";
		s1.concat(" world");
		s1.toUpperCase();
		System.out.println(s1);
		
		String s2 = s1.concat(" world");
		System.out.println(s2);

		String s3 = s1.toUpperCase();
		System.out.println(s3);
	}

}
