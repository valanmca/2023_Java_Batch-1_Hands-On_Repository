package com.core.day_02;

public class String_class_2 {

	public static void main(String[] args) {
		String s1="java";
		char ch[]=s1.toCharArray();
		 for (char c:ch)
		 {
			 System.out.println(c);
		 }
		 
		 String s2="Welcome to Java Program";
		 
		 String temp[]=s2.split(" ");
		 for (int i=0;i<temp.length;i++)
		 {
			 System.out.println(temp[i]);
		 }
	}

}
