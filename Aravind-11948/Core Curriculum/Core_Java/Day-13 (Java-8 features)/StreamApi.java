package com.core.day_13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		
		List<String > strList=Arrays.asList("abc","","cde","defd"," ");
		
		long count =strList.stream()
				.filter(x->x.startsWith("a"))
				.count();
	}

	//.map(x->x.upperCase())
	//.collect(Collectors.joining(","))
	
	/// number.stream().map(x->x*x).forEach(y->System.ou.println(y));
}
