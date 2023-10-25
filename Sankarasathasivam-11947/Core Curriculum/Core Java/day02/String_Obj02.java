package com.shiva.core.day02;

public class String_Obj02 {

	public static void main(String[] args) {
		String s1="Shiva";
		char ch[]=s1.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		String s2="Welcome to Java Programming";
		String temp[]=s2.split(" ");
		for(String t:temp)
		{
			System.out.println(t);
		}
	}

}
