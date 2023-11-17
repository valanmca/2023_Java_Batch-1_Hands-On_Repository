package com.sara.CoreJava.Day_06;

public class Inheritance_Example02 {

	void concat(int a, int b) {
		System.out.println(a + " " + b);
	}

	void concat(String a, String b) {
		System.out.println(a + " " + b);
	}

	void concat(float a, float b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {

		Inheritance_Example02 obj = new Inheritance_Example02();
		obj.concat(10, 20);
		obj.concat("Sara", "Sara");
		obj.concat(18.2f, 17.3f);
	}

}
