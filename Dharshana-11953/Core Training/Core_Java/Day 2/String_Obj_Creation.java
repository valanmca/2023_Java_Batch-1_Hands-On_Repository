package com.dharshu.day2;

//String Class Methode
public class String_Obj_Creation {

	public static void main(String[] args) {
		String s1="Dharshu";
		String s2="dharshu";
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.charAt(1)); // h
		System.out.println(s1.indexOf('h')); // 1
		System.out.println(s1.lastIndexOf('h')); // 5
		System.out.println(s1.length()); // 7 return to no of character
		System.out.println(s1.replace('h','m')); // Dmarsmu -- replace all the 'a' into 'm'
		System.out.println(s1.replace('m','h')); // Dharshu -- replace all the 'm' into 'a'
		System.out.println(s1.concat("Minion")); // Dharshu Minion
		System.out.println(s1.toUpperCase()); // DHARSHU
		System.out.println(s1.toLowerCase()); // dharshu
		
		String s3="Dharshu Minion";
		System.out.println(s3.substring(3,7)); // rshu --- last index -1 
		System.out.println(s3.substring(3));  // rshu Minion
	}

}
