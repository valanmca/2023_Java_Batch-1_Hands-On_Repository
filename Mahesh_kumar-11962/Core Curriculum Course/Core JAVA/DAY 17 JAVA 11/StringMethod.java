package com.mahesh.core_java_day_17_v11;

import java.util.ArrayList;
import java.util.List;

public class StringMethod {

	public static void main(String[] args) {

		String st = "\u2005This java String Method\u2005this hava\u2005";
		// \u2005 is single space value in Unicode
		System.out.println(st.strip());// Remove the front space and rear space
		System.out.println(st.stripLeading());// Remove the front space
		System.out.println(st.stripTrailing());// Remove the rear space

		List<String> lst = new ArrayList<String>();
		lst.add("Java");
		lst.add("Batch");
		lst.add("I");
		
		
		
		String[] array = lst.stream().toArray(String[]::new);
		for (String s : array) {
			System.out.println(s);
		}
	}

}
