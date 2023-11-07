package com.muthu.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		
	     	//filter empty string
            List<String> strList=Arrays.asList("abc","","bcd","","defg","jk");
            Stream<String> count=strList.stream().filter(x ->x.isEmpty());
            System.out.println(count);
            
            System.out.println(strList);
            
            
            
            //length greater than 3
            long num=strList.stream()
            		.filter(x ->x.length()>3)
            		.count();
            System.out.println(num);
	}
}
