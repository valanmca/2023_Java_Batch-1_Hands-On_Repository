package com.jenish.day2;

//String Buffer is Mutable Object in Java

public class StringBuffer_Mutable_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");
		sb.append("World");
		System.out.println(sb); //JavaWorld
		System.out.println(sb.capacity()); //20
	}

}
