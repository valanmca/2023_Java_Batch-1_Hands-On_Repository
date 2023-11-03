package com.naveen.day_13;

import java.util.ArrayList;
import java.util.List;

public class Ex05_foreach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(50);
		
		list.forEach(number -> System.out.println(number));
		
		System.out.println("-----------------------");
		
		list.forEach(System.out::println);
}
}
