//Count the String in the array
package com.pravinkumar.day14;

import java.util.Locale;

//Using the ARRAY for count the string
public class Array_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGHY";
		int count = 0;
		int temp = 0;
		for (int i = 0; i <= s.length(); i++) {
			if (s.charAt(0) != 0) {
				count++;
			}
		}
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(count);
	}

}
