package com.gayathri.day17Java17Features;

public class P9PatternMatchingInstanceOf {

	public static void main(String[] args) {
		
		String obj = "Gayathri";
		System.out.println(obj.length());

		//old way
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str.length());
		}
		
		//new way
		if(obj instanceof String str) {
			System.out.println(str.length());
		}

	}

}
