//Example for Pattern matching
package com.sara.CoreJava.Day_17;

public class PatternMatching {

	public static void main(String[] args) {
		String obj = "Sarabudheen";

		System.out.println(obj.length());

		if (obj instanceof String) {
			String str = (String) obj;
			System.out.println(str.length());
		}

		if (obj instanceof String str) {
			System.out.println(str.length());
		}
	}

}
