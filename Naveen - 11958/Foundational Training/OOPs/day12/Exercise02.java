package com.naveen.day12;

//Method Over loading program 
class Addition {
	void add(int x, int y) {
		int sum = x + y;
		System.out.println("The Addition is : " + sum);
	}

	void add(float x, float y) {
		float sum = x + y;
		System.out.println("The Addition is : " + sum);
	}

	void add(double x, double y) {
		double sum = x + y;
		System.out.println("The Addition is : " + sum);
	}

}

public class Exercise02 {

	public static void main(String[] args) {

		Addition obj = new Addition();
		obj.add(12, 12);
		obj.add(12.0f, 12.0f);
		obj.add(12.00f, 12.00f);

	}

}
