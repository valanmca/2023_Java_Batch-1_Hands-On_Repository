package com.sara.CoreJava.Day_15;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Sara");
		studentList.add("Virat");
		studentList.add("Kohli");

		System.out.println(studentList);
		System.out.println("*************************");

		studentList.forEach(student -> System.out.println(student));// By lambda expression
		System.out.println("*************************");

		studentList.forEach(System.out::println);// By method reference
		System.out.println("*************************");
	}

}
