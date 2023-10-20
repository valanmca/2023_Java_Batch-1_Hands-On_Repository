package com.jeban.JavaArray;


//String Buffer Is Mutable objects in java
public class JavaStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);//Java World
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		

	}

}
