package com.jenish.day14;

import java.util.ArrayList;

public class Ex_4_ForEach {

	public static void main(String[] args) {
		ArrayList<String> StudentList = new ArrayList<String>();
		
		StudentList.add("Dharshu");
		StudentList.add("Minion");
		StudentList.add("Dharshana");
		StudentList.add("DharshuAlagar");
		
		//System.out.println(StudentList);
		
		StudentList.forEach(student -> System.out.println(student));
		
		System.out.println("--------------------");
		
		StudentList.forEach(System.out::println);
		System.out.println("--------------------");
	}

}
