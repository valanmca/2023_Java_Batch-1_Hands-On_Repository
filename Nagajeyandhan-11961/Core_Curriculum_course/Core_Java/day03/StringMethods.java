package com.jeyandhan.day03;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "java";
		String s3 = "Java World";
		
		//predefined string methods
		
		System.out.println("\nS1 and S2 is equal: "+s1.equals(s2)); // false
		
		System.out.println("\nS1 and S2 is equal:"+s1.equalsIgnoreCase(s2)); //true
		
		System.out.println("\nCharacter at 1st Index: "+s1.charAt(1)); // a
		
		System.out.println(s1.indexOf("\nIndex of a:"+'a')); //1
		
		System.out.println(s1.lastIndexOf("\nLast Index of a: "+'a')); //3
		
		System.out.println("\nLength of the string: "+s1.length()); //4
		
		System.out.println("\nReplace a as z "+s1.replace('a', 'z')); // Jzvz
		
		System.out.println("\n"+ s1.concat("World")); //Jzvz World
		
		System.out.println("\nUppercase:"+s1.toUpperCase()); // JZVZ
		
		System.out.println("\nUppercase:"+s1.toLowerCase()); // jzvz
		
		System.out.println("\nSubstring: "+s3.substring(3,7)); // a Wo
		
		System.out.println("\nSubstring: "+s3.substring(3)); // a World
		
	}

}
