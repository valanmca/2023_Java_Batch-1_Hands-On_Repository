package com.madhan.coreday3;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java Worlddd"); //default 16 + adding string
		sb.append("World Madhan");
		System.out.println(sb);
		System.out.println(sb.capacity());
		

	}

}
