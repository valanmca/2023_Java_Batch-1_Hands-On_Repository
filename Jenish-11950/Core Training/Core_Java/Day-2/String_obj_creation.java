package com.jenish.day2;

//String Class Methods

public class String_obj_creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "java";
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.charAt(1)); //a
		System.out.println(s1.indexOf('a')); //1
		System.out.println(s1.lastIndexOf('a')); //3
		System.out.println(s1.length()); //4
		System.out.println(s1.replace('a', 'z')); //Jzvz -->replace all the old char 'a' into new char 'z' 
		System.out.println(s1.concat("World")); //"JavaWorld"
		System.out.println(s1.toUpperCase()); //JAVA
		System.out.println(s1.toLowerCase()); //java
		
		String s3 = "Java World";
		System.out.println(s3.substring(3, 7)); //a Wo
		System.out.println(s3.substring(3)); //a World
		
	}

}
