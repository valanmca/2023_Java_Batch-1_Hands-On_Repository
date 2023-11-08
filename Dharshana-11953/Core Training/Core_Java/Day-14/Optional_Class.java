package com.dharshu.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional_Class {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		Optional<List<Integer>> lopt = Optional.of(list); //To use in list
		System.out.println(lopt.get());
		
		int value=15;
		Optional<Integer> opt1=Optional.of(value); //To use Integer value
		
		String str[]=new String[10];
		str[1]="Dharshu";
		str[2]="Minion";
		Optional<String> opt=Optional.ofNullable(str[1]); //To use in String
		if(opt.isPresent()) {
			String str1=str[1].concat(" "+str[2]);
			System.out.println(str1);
			System.out.println(opt.get());
			System.out.println(opt.isEmpty());
			System.out.println(opt.hashCode());
			
		}else
			System.out.println("String is not Present");
	}

}
