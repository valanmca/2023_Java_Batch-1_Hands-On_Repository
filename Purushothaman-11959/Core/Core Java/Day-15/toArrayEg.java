package com.purushoth.day_15;

import java.util.ArrayList;
import java.util.List;

public class toArrayEg {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Features");
		list.add("toArray");
		String[] arr=list.stream().toArray(String[]::new);
		for(String s:arr) {
			System.out.println(s);
			
		}

	}

}
