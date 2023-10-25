package com.shiva.core.day02;

//StringBuffer is Mutable Objects in Java
public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
