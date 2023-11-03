package com.naveen.day_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04_Stream {

	public static void main(String[] args) {
		//filter empty string
		List<String> strList = Arrays.asList("abc"," ","defg"," ","ghi","de");
		long count = strList.stream()
							.filter(x -> x.isEmpty()) //isBlank()
							.count();
		System.out.println(count);
		
//		//length greater than 3
//		long num = strList.stream()
//						  .filter(x -> x.length())
//						  .count();
//		
//		System.out.println(num);
		
		//start with a
		long count1 = strList.stream()
				  .filter(x -> x.startsWith("a"))
				  .count();

	    System.out.println(count1);
	    
	    //filter empty string
	    List<String> filtered = strList.stream()
	    		.filter(x -> !x.isEmpty())
	    		.collect(Collectors.toList());
	    
	    System.out.println(filtered);
	    
//	    //transform into uppercase
//	    List<String> countries = Arrays.asList("usa", "Japan", "France", "Italy", "uk", "Canada");
//	    String country = countries.stream()
//	    		.filter(x -> x.toUpperCase())
//	    		.collect(Collectors.joining(", "));
//	    
//	    System.out.println(country);
	    
	    //square
	    List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
	    List<Integer> distinct = numbers.stream()
	    		.map( i -> i*i)
	    		.distinct()
	    		.collect(Collectors.toList());
	    
	    System.out.println(distinct);
	    
	    List<Integer> number = Arrays.asList(2,3,4,5);
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	}

}
