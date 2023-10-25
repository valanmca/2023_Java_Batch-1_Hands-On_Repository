package com.shiva.core.day02;

public class String_Builder {

	public static void main(String[] args) {
		String s1="Java";//here it checks the memory and point out the same memory location
		String s2="Java";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true
		
		System.out.println("Using new Keyword it takes another memory location");
		String c1=new String("Java");
		String c2=new String("Java");
		
		System.out.println(c1.equals(c2));//true
		System.out.println(c1==c2);//false
		
		System.out.println(s1.equals(c1));//true
		System.out.println(s1==c1);//false
	}

}
