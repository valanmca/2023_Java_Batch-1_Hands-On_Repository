package com.gayathri.day15Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P8StreamMethods {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("GAYAthri", " ", "abi", " ","  ","DEVI");
		long count1 = strList.stream().filter(x -> x.isBlank()).count();
		//isBlank - check and count blank spaces.
		//isEmpty - check empty
		long count2 = strList.stream().count();
		System.out.println(count1);
		System.out.println(count2);
		
		long num = strList.stream().filter(x -> x.length()>3).count();
		System.out.println(num);
		
		long startsWithA = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.println(startsWithA);
		
		List <String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		
		//transform into uppercase
		List <String> countries = Arrays.asList("gayathri","devi");
		String country = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(country);
		
		//square
		
	}

}

