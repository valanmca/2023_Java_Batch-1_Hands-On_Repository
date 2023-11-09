package com.jeyavel.core.java8;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> StudentList =new ArrayList<String>();
		
		StudentList.add("jeyavel");
		StudentList.add("Matthew");
		StudentList.add("harrish");
		StudentList.add("Mahesh");
		
		//in Normal way
		System.out.println(StudentList);
		
		//In For Each
		StudentList.forEach(student -> System.out.println(student));
		System.out.println("-----------------------------------");
		
		StudentList.forEach(System.out::println);

	}

}
