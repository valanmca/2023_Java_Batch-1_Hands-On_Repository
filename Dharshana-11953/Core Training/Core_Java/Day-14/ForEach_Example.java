package com.dharshu.day14;

import java.util.ArrayList;

public class ForEach_Example {

	public static void main(String[] args) {
		ArrayList<String> StudentList = new ArrayList<String>();
		
		StudentList.add("Dharshu");
		StudentList.add("Minion");
		StudentList.add("Dharshana");
		StudentList.add("DharshuAlagar");
		
		System.out.println(StudentList);//[Dharshu,Minion,Dharshana,DharshuAlagar]
		
		StudentList.forEach(student -> System.out.println(student));
		
		System.out.println("----------------------------");
		
		StudentList.forEach(System.out::println);

	}

}
