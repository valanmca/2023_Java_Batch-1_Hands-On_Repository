package com.dharshu.day2;

public class StringBuffer_Mutable_Object {

	//StringBuffer use the same memory it does not allocate new memory for every execution
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Dharshu"); 
		sb.append("Alagar");
		System.out.println(sb.capacity());
		System.out.println(sb);
	}

}
