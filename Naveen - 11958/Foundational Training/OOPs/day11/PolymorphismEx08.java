package com.naveen.day11;

//Method Overloading (Concatenation)
class MyConcatination {
	void concat(int a, int b) {
		System.out.println("Integer concat : " + a + +b);

	}

	void concat(float a, float b) {
		System.out.println("Float concat : " + a + +b);

	}

	void concat(String a, String b) {
		System.out.println("String concat : " + a + b);

	}

}

public class PolymorphismEx08 {

	public static void main(String[] args) {
		MyConcatination obj = new MyConcatination();
		obj.concat(10, 20);
		obj.concat(10.0f, 30.0f);
		obj.concat("Naveen", "Raj");

	}

}
