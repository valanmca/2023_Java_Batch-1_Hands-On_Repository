package com.jeban.day5;//Duplicate Value
import java.util.TreeSet;

import java.util.TreeSet;

public class Tree3 {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();

		ts1.add("g");
		ts1.add("h");
		ts1.add("A");
		ts1.add("c");
		ts1.add("f");
		ts1.add("j");
		ts1.add("Jeban");
		ts1.add("Jeban");
		ts1.add("apple");
		ts1.add("Apple");
		ts1.add("Banana");
		ts1.add("Orange");
		ts1.add("Mango");

		System.out.println(ts1);//

	}

}
