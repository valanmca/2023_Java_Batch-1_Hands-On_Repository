package com.purushoth.day_02;

public class ExampleStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" Enter into the world");
		System.out.println(sb);
		System.out.println(sb.capacity());//Adding the buffer by 16 with value default added.


	}

}//StringBuffer is mutable objects in java
