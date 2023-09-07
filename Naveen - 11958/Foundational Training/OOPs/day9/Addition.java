package com.naveen.day9;

//Addition of Instance and Static Variables.
public class Addition {

	int a = 10; // Instance

	static int b = 20; // Static

	public static void main(String[] args) {

		Addition obj = new Addition();
		System.out.println(obj.a + Addition.b);

	}

}

