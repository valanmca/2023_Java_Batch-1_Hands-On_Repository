package com.matthew.test;

class shapes{
	void get_area(int a, int b){
		System.out.println("The formula for the shape is not found so the given valus are "+(a)+" and "+(b));
	}
}

class rectangle{
	void get_area(int a,int b) {
		System.out.println("Area of rectangle is" +(a*b));
	}
}
public class coreShapes {

	public static void main(String[] args) {
		shapes square = new shapes();
		square.get_area(5, 7);
		rectangle rectangle1 = new rectangle();
		rectangle1.get_area(5,7);

	}

}
