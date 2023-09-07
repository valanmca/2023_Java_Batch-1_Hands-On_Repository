package com.mahesh.ds_day5;

import java.util.Collections;
import java.util.TreeSet;

public class Tree_Reverse {

	public static void main(String[] args) {
		TreeSet<String> fruits =new TreeSet<String>(Collections.reverseOrder());
		//tree sort the values based on ASCII
		//Using Collections.reverseOrder() we make it as Treeset as decending orderwise
		fruits.add("Graps");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Peach");
	
		System.out.print(fruits);//[Peach, Orange, Graps, Banana, Apple]

	}

}
