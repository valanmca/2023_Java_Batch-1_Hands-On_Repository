package com.dharshu.day2;

public class String_Equals {

	public static void main(String[] args) {
		String s1 = new String ("Dharshu");
		String s2 = new String ("Dharshu");
		
		System.out.println(s1.equals(s2)); // true ---> it check the content
		System.out.println(s1==s2); // false ---> it check the memory location
		
		String s3 = "Dharshu";
		String s4 = "Dharshu";
		
		System.out.println(s3.equals(s4)); // true 
		System.out.println(s3==s4); // true
		
		System.out.println(s1.equals(s3)); // true 
		System.out.println(s1==s3); // false ---> because s1 present in some different memory loction and s3 is present in some memory location.
		
		
	}

}
