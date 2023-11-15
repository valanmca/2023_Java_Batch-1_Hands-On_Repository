package com.shiva.core.day14;

import java.util.ArrayList;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Features");
		list.add("toArray");
		String[] array = list.stream().toArray(String[]::new);

		for (String s : array) {
			System.out.println(s);
		}

	}

}