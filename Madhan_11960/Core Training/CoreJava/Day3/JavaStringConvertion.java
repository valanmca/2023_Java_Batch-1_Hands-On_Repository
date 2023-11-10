package com.madhan.coreday3;

public class JavaStringConvertion {

	public static void main(String[] args) {
		String s1="Java";
		char ch[]=s1.toCharArray();
		for(char c : ch)
		{
			System.out.println(c);
		}
		
		String s2="Welcome to Java Program";
		String temp[]=s2.split(" "); // we can give any delimeter like where to where we need to split.
		for(String t : temp)
		{
			System.out.println(t);
		}
		

	}

}
