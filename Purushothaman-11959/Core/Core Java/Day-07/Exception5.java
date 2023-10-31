package com.purushoth.day_07;

public class Exception5 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		//Object o=new Exception5(); //DMD
		Exception5 i=(Exception5) new Object(); //Opposite of DMD (ClassCastException)
		System.out.println("After Exception");

	}

}
