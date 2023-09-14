
//Method OverLoading (CompileTime Polymorphism)
package com.jeyavel.OOPS.day11;

class MyConcatination {
	void concat(int a, int b) {
		System.out.println("integer Concat ->" + a + b);
	}

	void concat(float a, float b) {
		System.out.println("Float Concat ->" + a + b);
	}

	void concat(String a, String b) {
		System.out.println("String Concat ->" + a + b);
	}

}

public class ConcatinationEx {

	public static void main(String[] args) {
		MyConcatination concats = new MyConcatination();

		concats.concat(2.1f, 4.5f);
		concats.concat(23, 10);
		concats.concat("jeyavel", "rajan");

	}

}
