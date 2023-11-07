package com.jenish.day14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_3_StreamAPI {

	public static void main(String[] args) {
		//Filter empty string
		List<String> strlist = Arrays.asList("abc", " ", "bcd", " ", "defg", "jk");
		long count = strlist.stream()
				.filter(x -> x.isEmpty())
				.count();
		System.out.println(count); //0
		System.out.println(strlist);  //[abc,  , bcd,  , defg, jk]
		
		//length greater than 3
		long num = strlist.stream()
				.filter(x -> x.length()>3)
				.count();
		System.out.println(num); //1
		
		//starts with a
		long count1 = strlist.stream()
				.filter(x -> x.startsWith("a"))
				.count();
		
		System.out.println(count1); //1
		
		List<String> filtered = strlist.stream()
				.filter(x -> !x.isEmpty())
				.collect(Collectors.toList());
		System.out.println(filtered);
		
		//transform into uppercase
		List<String> countries = Arrays.asList("USA", "Japan", "France", "UK");
		String country = countries.stream()
				.map(x -> x.toUpperCase())
				.collect(Collectors.joining(" , "));
		System.out.println(country);
		
		//square
		List<Integer> numbers=Arrays.asList(9,5,3,8,1,45,3);
		List<Integer> distinct = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().map(x->x*x).forEach(y->System.out.println(y));

	}

}
