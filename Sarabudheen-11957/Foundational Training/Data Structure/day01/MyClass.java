/******Calculate Sum and Average of Student Marks******/
package com.sara.day01;

public class MyClass {

	public static void main(String[] args) {
		int sId = 101;
		String sName = "Sara";
		int m1 = 50, m2 = 60, m3 = 70;
		int sum = m1 + m2 + m3;
		int avg = sum / 3;
		System.out.println("Student Id : " + sId);
		System.out.println("Student Name : " + sName);
		System.out.println("Student Mark1 : " + m1);
		System.out.println("Student Mark2 : " + m2);
		System.out.println("Student Mark3 : " + m3);
		System.out.println("Total Mark: " + sum);
		System.out.println("Average Mark : " + avg);
	}

}
