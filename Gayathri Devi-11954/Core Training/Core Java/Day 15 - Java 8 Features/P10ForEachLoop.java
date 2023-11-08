package com.gayathri.day15Java8Features;

import java.util.ArrayList;

public class P10ForEachLoop {

	public static void main(String[] args) {
		ArrayList <String> studentList = new ArrayList <String> ();
		studentList.add("ga");
		studentList.add("ya");
		studentList.add("th");
		studentList.add("ri");
		System.out.println("\n Normal");
		System.out.println(studentList);
		
		System.out.println("\n Using Foreach loop with lambda");
		studentList.forEach(student -> System.out.println(student));
		
		System.out.println("\n Using Foreach loop with method reference");
		studentList.forEach(System.out::println);
		

	}

}
