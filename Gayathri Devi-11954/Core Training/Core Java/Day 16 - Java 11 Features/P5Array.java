package com.gayathri.day16Java11Features;

import java.util.ArrayList;
import java.util.List;

public class P5Array {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Features");
		list.add("toArray");
		String[] array = list.stream().toArray(String[]::new);
		for (String s : array) {
			System.out.println(s);
		}
		
		String[] array1 = new String[list.size()];
	      array1 = list.toArray(array1);
	      for (String s : array1) {
	         System.out.println(s);
	      }
		
	}
}