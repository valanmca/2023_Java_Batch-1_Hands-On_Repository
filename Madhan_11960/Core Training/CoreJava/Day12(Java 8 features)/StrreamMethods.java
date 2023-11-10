package com.madhan.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrreamMethods {

	public static void main(String[] args) {
//		//filter empty string
        List<String> strList = Arrays.asList("abc", " ", "bcd", " ", "defg", "jk");
//        long count = strList.stream()
//                             .filter(x -> x.isBlank())
//                             .count();
//        System.out.println(count);
//        System.out.println(strList);
//        
//        //length greater than 3
//        long num = strList.stream()
//                .filter(x -> x.length()> 3)
//                .count();
//        
//        System.out.println(num);
//        
////        //starts with a
//       long count1 = strList.stream()
//               .filter(x -> x.startsWith("a"))
//                .count();
        
//        System.out.println(count1);
//        
        //filter empty string and stored it in a list
        List<String> filtered = strList.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        
        System.out.println(filtered);
//        
//        //transform into uppercase
        List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        String country = countries.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", ")); 
        
        System.out.println(country);
        
        //square
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream()
                                        .map( i -> i*i)
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(distinct);
        
    
        List<Integer> number = Arrays.asList(2,3,4,5);
        number.stream().map(x->x*x).forEach(y->System.out.println(y));
	}

}
