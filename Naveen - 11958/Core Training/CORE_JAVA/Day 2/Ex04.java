package com.naveen.day2;
/*Strings are Immutable*/
public class Ex04 {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat(" World");    /*Due to string is immutable it will not reflect in s1.
		                          it is assigned as new string which is unreferenced obj
		                           it will automatically removed by garbage collector*/
		System.out.println(s1); //Java
		
		s1 = s1.concat(" World");
		System.out.println(s1); //Java World
		
		s1 = s1.toUpperCase();
		System.out.println(s1); //Java World
	}

}
