package com.jeyavel.coreDay1;

class shapes{
	void get_area(int a,int b) {
		System.out.println("The formula for the shapes is not found so the given values are"+(a)+" and "+(b));
	}
}
class rectangle{
	void get_area(int a,int b) {
		System.out.println("area of rectangle is "+(a*b));
	}
}

public class CoreShapesExno3 {

	public static void main(String[] args) {
	    shapes square = new shapes();
	    square.get_area(5, 7);
	    rectangle rectangle1 = new rectangle();
	    rectangle1.get_area(5, 7);
	}

}
