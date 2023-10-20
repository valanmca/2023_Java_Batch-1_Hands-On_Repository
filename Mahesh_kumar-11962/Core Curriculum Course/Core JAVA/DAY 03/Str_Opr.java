package com.mahesh.core_java_day_03;

public class Str_Opr {

	public static void main(String[] args) {
		// String 
		String s1 = "Java";
		String s2 = " World";
		s1.concat(s2);
		System.out.println(s1); // java
		s1.concat(s2).toUpperCase();
		System.out.println(s1); // java
		
		
		s1=s1.concat(s2);
		System.out.println(s1); //java world
		s1 = s1.toUpperCase();
		System.out.println(s1); // JAVA WORLD
		
		s1 = s1.concat(s2).toUpperCase();
		System.out.println(s1); // JAVA WORLD WORLD
		
		
	}

}
