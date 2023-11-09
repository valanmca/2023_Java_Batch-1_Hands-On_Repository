package com.jeyavel.core.java11;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperation11 {

	public static void main(String[] args) {
		List<String>List = new ArrayList<>();
		List.add("java");
		List.add("Features");
		List.add("To Array");
		
		String[] array =List.stream().toArray(String[]::new);
		for(String s:array) {
			System.out.println(s);
		}
		

	}

}
