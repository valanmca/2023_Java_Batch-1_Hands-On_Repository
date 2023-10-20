package com.jeban.JavaArray;

//String class method
public class JavaString2 {

	public static void main(String[] args) {
		String s1="Java";
		char ch[]=s1.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		
		String s2="Welcome to Java Program";
		String temp[]=s2.split(" ");
		for(String t:temp) {
			System.out.println(t);
		}
		
		//immutable string object
		s1=s1.concat(" World");
		System.out.println(s1);//Java World
        
		s1=s1.toUpperCase();
	    System.out.println(s1);//JAVA WORLDS	
	}

}
