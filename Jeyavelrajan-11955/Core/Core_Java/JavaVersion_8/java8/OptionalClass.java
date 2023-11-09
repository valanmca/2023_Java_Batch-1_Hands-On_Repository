package com.jeyavel.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(50);
		Optional<List<Integer>> iopt = Optional.of(list);//To use Optional Of
		System.out.println(iopt.get());
		
		int value=15;
		Optional <Integer> opt1=Optional.of(value); //To use Integer Value
		
		String[] str = new String[10];
		str[1]="JAVA";
		str[2]="Program";
		Optional<String> strOpt = Optional.ofNullable(str[1]);//To use in String 
		if(strOpt.isPresent()) {
			String str1 = str[1].concat(""+str[2]);
			System.out.println(str1);
			System.out.println(strOpt.get());
			System.out.println(strOpt.isEmpty());
			System.out.println(strOpt.hashCode());
		}else {
			System.out.println("String Value is Not Present ");
		}
		

	}

}
