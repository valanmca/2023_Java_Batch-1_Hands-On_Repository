//Optional Class Example
package com.sara.CoreJava.Day_15;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String[] str = new String[10];
		str[1] = "Virat";
		// str[1] = null;
		str[2] = "Kohli";

		int value = 15;

		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		Optional<String> opt1 = Optional.ofNullable(str[1]);// Optional class for String
		Optional<Integer> opt2 = Optional.of(value);// Optional class for Integer
		Optional<List> opt3 = Optional.of(list);// Optional class for List

		if (opt1.isPresent()) {
			String str1 = str[1].concat(str[2]);
			System.out.println(str1); //ViratKohli
			System.out.println(opt1.get()); //Virat
			System.out.println(opt1.isEmpty());
			System.out.println(opt1.hashCode());
			System.out.println(opt2.get()); //15
			System.out.println(opt3.get()); //[10, 20, 30]

		} else {
			System.out.println("String value not present");
		}

	}

}
