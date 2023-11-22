package com.gayathri.day16Java11Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P2SLines {

	public static void main(String[] args) {
		String str = "Hai this is java program\nthis is string lines() method\rjava.lang.String.lines()";
		long lineCount = str.lines().count();
		System.out.println("No of lines: " + lineCount);
		List<String> lines = str.lines().collect(Collectors.toList());
		System.out.println(lines);
		
		System.out.println("\n");
		
		Stream<String> strs=str.lines();
        strs.forEach(st->System.out.println(st)); //for each with lambda
        
        System.out.println("\n");
        
        Stream<String> strAns = str.lines();
        strAns.forEach(System.out::println); //with method reference
	}
}
