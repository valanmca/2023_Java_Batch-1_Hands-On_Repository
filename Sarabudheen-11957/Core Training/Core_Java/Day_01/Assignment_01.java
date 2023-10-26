/******** Sample Java program to find area of rectangle ********/
package com.sara.CoreJava.Day_01;

class shape {

	// Creating getArea() method
	void getArea() {
		System.out.println("");
	}
}

class rectangle extends shape {

	// getArea() Method overriding
	void getArea(int width, int length) {
		System.out.println(width * length);
	}
}

public class Assignment_01 {

	public static void main(String[] args) {

		// Creating an object for rectangle class
		rectangle rec = new rectangle();
		rec.getArea(20, 40);
	}

}
