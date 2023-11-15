package com.shiva.core.day14;

import java.util.stream.Stream;

public class NewStringMethods {

	public static void main(String[] args) {
		// is blank

		String s1 = "";
		System.out.println(s1.isBlank());
		String s2 = " ";
		System.out.println(s2.isBlank());
		String s3 = "djhgds";

		System.out.println(s3.isBlank());

		// lines methods

		String str = "hai how are you \n is s \r";

		// lambda expression
		Stream<String> str1 = str.lines();

		str1.forEach(s -> System.out.println(s));
		Stream<String> str12 = str.lines();

		str12.forEach(System.out::println);

		// repeat()
		String a = "java program";
		String b = a.repeat(5);

		System.out.println(b);

		// Strip() removes front and last space
		String st = "\t this is java strip()\t";
		String s1t = "\t this is java strip()\t";

		System.out.println(st);
		System.out.println(st.strip());

		System.out.println("Strip leading"); // removes front
		System.out.println(s1t);
		System.out.println(s1t.stripLeading());
		System.out.println(s1t.stripTrailing());// remove last

	}

}
