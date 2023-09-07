package com.swetha.day13;
//Hierarchial inheritance and overriding
class Shape{
	
	void area() {
		System.out.println("Cannot define area");
	}
}
class Rectangle extends Shape{
	void area() {
		System.out.println("Area of rectangle ");
	}
}
class Circle extends Shape {
	
	void area() {
		
		System.out.println("Area of circle : ");
	}

}

public class InheritOverrideEx {

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.area();

	}

}
