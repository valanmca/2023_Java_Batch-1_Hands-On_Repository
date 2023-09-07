package com.matthew.day01;
public class Array {
	public static void main(String[] args) {
		// Primitive data structure except string it is predefined class in java so 's' is capital
		int sId = 101;
		String sName = "Matthew";
		int m1 = 50,m2 = 60, m3 = 70;
		int sum = m1+m2+m3;
		int avg = sum/3;
		// System is a predefined class
		System.out.println("Student Id : "+sId + "\nStudent Name : " + sName);
		System.out.println("Student Mark 1 : "+ m1);
		System.out.println("Student Mark 2 : "+ m2);
		System.out.println("Student Mark 3 : "+ m3);
		System.out.println("Total Marks : "+ sum);
		System.out.println("Average Marks : "+ avg);
	}

}
