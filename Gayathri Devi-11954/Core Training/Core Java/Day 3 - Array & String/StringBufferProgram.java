package com.gayathri.day3;

public class StringBufferProgram {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1 = new StringBuffer();
		sb.append(" World");
		System.out.println(sb);
		
		System.out.println(sb1.capacity());
		
		

	}

}

