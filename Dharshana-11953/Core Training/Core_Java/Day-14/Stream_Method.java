package com.dharshu.day14;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Method {

	public static void main(String[] args) {
		//filter empty String
		List<String> strList = Arrays.asList("abc"," ","bcd"," ","defg"," ","ghi");
		//The white space is consider as the value
		long count=strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count); //3 --> It display the empty string
		System.out.println(strList);
		
		//length greater than 3
		long num = strList.stream().filter(x -> x.length()>3).count();
		System.out.println(num);
		
		//Starts with a
		long count1 = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.println(count1);
		
		//filter empty string and stored it in a list
		List<String> filtered= strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		
		//Transform into Uppercase
		List<String> countries = Arrays.asList("Dharshana","Minion","ALAGAR");
		String country=countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(country);
		
		//square
		List<Integer> numbers=Arrays.asList(9,5,3,8,1,45,3);
		List<Integer> distinct = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
	}

}
