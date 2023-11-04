package com.core.day_14;

import java.util.ArrayList;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("java");
		list.add("c");
		list.add("python");
		String arr[]=list.stream().toArray(String[]::new );
		
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
