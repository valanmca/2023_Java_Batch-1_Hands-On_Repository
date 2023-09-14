package com.jenish.day13;

class Shapes {
	
	void area() {
		System.out.println("Shape Cannot define in Area");
	}
}

class Rectangle extends Shapes {
	void area() {
		System.out.println("Rectangle will defines Area length and breath");
	}
}

class Circle extends Shapes {
	void area() {
		
		System.out.println("Rectangle will defines Area: 3.14*r*r ");
	}
}
	
public class Inheritance_Shapes_Ex3 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle() ;
		obj.area();
		
		Object obj1 = new Object();
		obj.area();
		}
		
		
	}
	


