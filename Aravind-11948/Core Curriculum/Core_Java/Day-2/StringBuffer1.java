package com.core.day_02;

//StringBuffer are mutable object in java
public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Java");
		
		sb.append(" World1");
		System.out.println(sb);
		System.out.println(sb.capacity());
		

	}

}
