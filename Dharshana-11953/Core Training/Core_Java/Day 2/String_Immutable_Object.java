package com.dharshu.day2;

public class String_Immutable_Object {

	public static void main(String[] args) {
		String s1 = "Dharshu";
		s1= s1.concat("Alagar");
		System.out.println(s1); // Dharshu Alagar
		
		s1=s1.toUpperCase();
		System.out.println(s1); // DHARSHU ALAGR
	}

}
