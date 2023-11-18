//Example for Collection to Array
package com.sara.CoreJava.Day_16;

import java.util.LinkedList;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Sara");
		list.add("virat");
		list.add("Kohli");

		String[] array = list.stream().toArray(String[]::new);
		for (String s : array) {
			System.out.println(s);
		}
	}

}
