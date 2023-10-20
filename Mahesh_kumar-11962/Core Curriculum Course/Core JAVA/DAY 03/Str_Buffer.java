package com.mahesh.core_java_day_03;

public class Str_Buffer {

	public static void main(String[] args) {
		// String buffer is mutable
		StringBuffer sb= new StringBuffer("JAVA");
		sb.append(" LANGUAGE");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" LANGUAGE");
		System.out.println(sb.capacity());
		
		

	}

}
