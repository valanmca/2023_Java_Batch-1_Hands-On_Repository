package com.jeyandhan.day06;

public class Overloading {

	void area(int s) {
		System.out.println("Area of square: " +(s*s));
	}
	void area(float r) {
		System.out.println("Area of Circle: " +(3.14*r*r));
	}
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		
		obj.area(2.0f);
		obj.area(4);
	}

}
