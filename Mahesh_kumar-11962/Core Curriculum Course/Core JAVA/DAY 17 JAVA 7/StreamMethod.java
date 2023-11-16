package com.mahesh.core_java_day_16_V8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stlist = Arrays.asList("mahesh","kumar","","lakshman","harish");
		
		byte count = (byte) stlist.stream().filter(x->x.isBlank()).count();
		System.out.println(count);
		
		int c = (int) stlist.stream().filter(x->x.isEmpty()).count();
		System.out.println(c);
	
		List<String> filter = stlist.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		System.out.println(filter);

		List<Integer> num = Arrays.asList(2,4,1,44,2,4,29,0);
		List<Integer> distrinct = num.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println(distrinct);
		
				
	}

}
