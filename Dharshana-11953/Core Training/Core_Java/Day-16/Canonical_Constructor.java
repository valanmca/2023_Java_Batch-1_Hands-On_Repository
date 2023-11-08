package com.dharshu.day16;


public class Canonical_Constructor {
	public record Person1(String name, int age) {

	    public Person1(String name, int age) {
	        if (age < 18) {
	  throw new IllegalArgumentException("You are not allowed to participate in general elections");
	       }
	   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
