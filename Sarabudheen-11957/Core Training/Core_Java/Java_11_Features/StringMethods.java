//Example for String Methods
package com.sara.CoreJava.Day_16;

import java.util.stream.Stream;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = " ";
		String s3 = "Sara";

		// isBlack() Method
		System.out.println("S1 isBlank? :" + s1.isBlank());
		System.out.println("S2 isBlank? :" + s2.isBlank());
		System.out.println("S3 isBlank? :" + s3.isBlank());

		String str = "Hai this is java program\nthis is string lines() method\rjava.lang.String.lines()";
		// for each with lambda
		Stream<String> strs = str.lines();
		strs.forEach(st -> System.out.println(st));
		System.out.println("\n");

		// with method reference
		Stream<String> strAns = str.lines();
		strAns.forEach(System.out::println);
		System.out.println(" ");

		// repeat() method
		String str1 = "Java Program";
		String result1 = str1.repeat(5);
		System.out.println(result1);
		System.out.println(" ");

		// strip() method
		String st = " \t This is Java String strip() method \u2005";
		System.out.println(st);
		System.out.println(st.strip());
		System.out.println(" ");

		// stripLeading() method
		System.out.println(st);
		System.out.println(st.stripLeading());
		// last space not removed
		System.out.println(" ");

		// stripTrailing() method
		System.out.println(st);
		System.out.println(st.stripTrailing());
		// first space not removed
		System.out.println(" ");

	}

}
