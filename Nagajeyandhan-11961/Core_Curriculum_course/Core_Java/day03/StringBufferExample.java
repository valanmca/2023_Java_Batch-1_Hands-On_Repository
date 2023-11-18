package com.jeyandhan.day03;

//String Buffer is mutable objects in java

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");
		
		System.out.println(sb); // Java World
	}

}
