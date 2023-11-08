package com.gayathri.day15Java8Features;

import java.util.ArrayList;

public class P10ForEachLoopOrdered {

	public static void main(String[] args) {
		ArrayList <String> studentList = new ArrayList <String> ();
		studentList.add("th");
		studentList.add("ya");
		studentList.add("ri");
		studentList.add("ga");
		System.out.println("\n Normal");
		System.out.println(studentList);
		
		System.out.println("\n Using Foreach loop with lambda");
		studentList.stream().forEachOrdered(student -> System.out.println(student));
		
		System.out.println("\n Using Foreach loop with method reference");
		studentList.stream().forEachOrdered(System.out::println);
		

	}

}
