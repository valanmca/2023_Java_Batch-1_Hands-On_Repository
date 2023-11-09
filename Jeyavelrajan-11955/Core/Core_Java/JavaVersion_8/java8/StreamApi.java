package com.jeyavel.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		//filter empty string 
	    List<String> strList = Arrays.asList("abc"," ","bcd"," ","defg","jk");
	    long count = strList.stream()
	    		             .filter(x-> x.isEmpty())
//	    		             .filter(x->x.isBlank())
	    		             .count();
	    System.out.println(count);
//	    System.out.println(strList);
	    
	    //length greater than 3
	    long num = strList.stream()
	    		          .filter(x -> x.length()>3)
	    		          .count();
	    System.out.println(num);
	    
	    //Starts with a
	    long count1 = strList.stream()
	    		             .filter(x->x.startsWith("a"))
	    		             .count();
	    System.out.println(count1);
	    
	    //Filter Empty string and Stored it into the List 
	    List<String> filtered = strList.stream()
	    		.filter(x -> !x.isEmpty())
	    		.collect(Collectors.toList());
	    System.out.println(filtered);
	    
	    //Transform into Upper Case 
	    List<String> countries =Arrays.asList("Usa","Japan","France","Italy","U.K","canada");
	    String country = countries.stream()
                       .map(x->x.toUpperCase())
                       .collect(Collectors.joining(","));
	    System.out.println(country);
	    
//	    //Square

//	                                
	    

	}

}
