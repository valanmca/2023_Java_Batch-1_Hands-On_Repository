package com.madhan.coreday3;

public class JavaStringImmutable {

	public static void main(String[] args) {
		String s1="Java";
		s1=s1.concat("World"); //After assigning new object s1, it produces exact result
		System.out.println(s1); //JavaWorld
		
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		
		

	}

}
