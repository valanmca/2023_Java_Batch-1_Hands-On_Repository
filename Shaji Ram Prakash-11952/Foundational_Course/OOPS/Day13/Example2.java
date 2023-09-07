package com.shaji.Day13;

class shape1{
	int l,b,r;
	
	void area() {
		System.out.println("No formula for Shape without Mentioning");
	}
}

class Rectangle1 extends shape1{
	
	void area() {
		int area = l*b;
		System.out.println("Area of Rectangle : " +area);
	}
}

class Circle1 extends shape1{
	 void area() {
		 Double area = 3.14*(r*r);
		 System.out.println("Area of Circle : "+area);
	 }
}

public class Example2 {

	public static void main(String[] args) {
		Rectangle1 rect = new Rectangle1();
		rect.area();
		
		Circle1 circle = new Circle1();
		circle.area();

	}

}
