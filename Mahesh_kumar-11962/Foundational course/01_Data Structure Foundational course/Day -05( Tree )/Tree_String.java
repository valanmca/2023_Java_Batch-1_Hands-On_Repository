package com.mahesh.ds_day5;

import java.util.TreeSet;
public class Tree_String {

	public static void main(String[] args) {
		TreeSet<String> fruits =new TreeSet<String>();//tree don't add duplicate values
		//tree sort the values based on ASCII
		
		fruits.add("Graps");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Peach");
	
		System.out.print(fruits);//[Apple, Banana, Graps, Orange, Peach]
	
	}

}
