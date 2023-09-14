package com.domnic.oopsday5;
//method Overloading practice program
class Addition {
	void add(int a, int b) {
		System.out.println("Sum of " + a +" and "+ b + " is " + (a + b));
	}

	void add(float a, float b) {
		System.out.println("Sum of " + a +" and "+ b + " is " + (a + b));
	}

	void add(double a, double b) {
		System.out.println("Sum of " + a +" and "+ b + " is " + (a + b));
	}
}

public class Oopsprac2 {

	public static void main(String[] args) {
      Addition obj=new Addition();
      obj.add(4, 6);
      obj.add(23.0f, 43.0f);
      obj.add(45.03, 12.07);
	}

}
