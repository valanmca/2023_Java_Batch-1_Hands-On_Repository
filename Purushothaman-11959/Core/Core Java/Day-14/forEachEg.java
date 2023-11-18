package com.purushoth.day_14;

import java.util.ArrayList;

public class forEachEg {

	public static void main(String[] args) {
		ArrayList<String> stdList=new ArrayList<String>();
		stdList.add("Shiva");
		stdList.add("Naga");
		stdList.add("dom");
		stdList.add("Mahesh");
		
		stdList.forEach(std -> System.out.println(std));
		
		System.out.println("--------");
		stdList.stream().forEachOrdered(std -> System.out.println(std)); //By using this we can guarantee the order.
		
		System.out.println("------");
		
		stdList.forEach(System.out::println); //But for each doesn't guarantee.
	}

}
