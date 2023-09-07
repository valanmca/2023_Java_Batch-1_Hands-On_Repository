/****** Method Overloading for Concatenation Class... ********/
package com.sara.day11;

class MyConcatenation {
	void concat(int a, int b) {
		System.out.println(String.valueOf(a) + String.valueOf(b));
	}

	void concat(float a, float b) {
		System.out.println(String.valueOf(a) + String.valueOf(b));
	}

	void concat(String a, String b) {
		System.out.println(a + b);
	}

}

public class Polymorphism_Ex07 {

	public static void main(String[] args) {
		MyConcatenation obj = new MyConcatenation();

		obj.concat(10, 20);
		obj.concat(10.0f, 20.0f);
		obj.concat("Sara", "Shaji");

	}

}
