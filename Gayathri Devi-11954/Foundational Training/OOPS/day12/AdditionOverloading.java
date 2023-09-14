package com.gayathri.day12;

class AddValues {

	void calculate(int a, int b) {
		System.out.println("Adding 2 int values : " + (a + b));
	}

	void calculate(float a, float b) {
		System.out.println("Adding 2 float values : " + (a + b));
	}

	void calculate(double a, double b) {
		System.out.println("Adding 2 double values : " + (a + b));
	}

}

public class AdditionOverloading {

	public static void main(String[] args) {
		
		AddValues inttype = new AddValues();
		inttype.calculate(333, 234);
		
		AddValues floattype = new AddValues();
		floattype.calculate(5.58f, 5.5f);
		
		AddValues doubletype = new AddValues();
		doubletype.calculate(5.58d, 5.9d);

	}

}
