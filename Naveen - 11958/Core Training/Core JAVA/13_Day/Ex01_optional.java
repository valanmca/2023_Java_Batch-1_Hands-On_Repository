package com.naveen.day_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex01_optional {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(50);
		Optional<List<Integer>> lopt = Optional.of(list);
		System.out.println(lopt.get());
		
		int value = 15;
		Optional<Integer> opt1 = Optional.of(value);
		
		String[] str  = new String[10];
		//str[1] = "JAVA";
		str[1] = null;
		str[2] = "PROGRAM";
		
		Optional <String> opt = Optional.ofNullable(str[1]);
		if(opt.isPresent()) {
			String str1 = str[1].concat(" "+str[2]);
			System.out.println(str1);
			System.out.println(opt.get());
			System.out.println(opt.isEmpty());
			System.out.println(opt.hashCode());
		}else
			System.out.println("String value is not present");
		
	}

}
