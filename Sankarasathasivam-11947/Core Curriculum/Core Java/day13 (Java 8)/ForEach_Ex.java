package com.shiva.core.day13;

import java.util.ArrayList;
import java.util.List;


public class ForEach_Ex {

	public static void main(String[] args) {
		ArrayList<String> StudentList = new ArrayList<String>();

		StudentList.add("Shiva");
		StudentList.add("Madhan");
		StudentList.add("Domnic");
		StudentList.add("Purushoth");

//		System.out.println(StudentList);
		
		StudentList.forEach(student -> System.out.println(student));
		
		System.out.println("-------------------------------");
		
		StudentList.forEach(System.out::println);
		
	}

}
