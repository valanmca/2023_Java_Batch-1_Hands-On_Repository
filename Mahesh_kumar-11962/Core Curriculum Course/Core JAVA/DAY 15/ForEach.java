package com.mahesh.core_java_day_16_V8;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
	
		ArrayList<String> lst = new ArrayList<String>();
		
		lst.add("Mahesh");
		lst.add("Manoj");
		lst.add("Madhan");
		System.out.println(lst);
		System.out.println("\n------\n");
		lst.forEach(name->System.out.println(name));
		System.out.println("\n------\n");

		lst.forEach(System.out::println);
	}

}
