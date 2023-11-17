package com.sara.CoreJava.Day_06;

class Shape{

	//method
	
	void calculateArea() {
		System.out.println("Area of the Shape");
	}
}

class Circle extends Shape{
	//Variables
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	void calculateArea() {
		System.out.println("Area of the circle is : "+ 3.14 * radius * radius);
	} 
}

class Rectangle extends Shape{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void calculateArea() {
		System.out.println("Area of the Rectangle is : "+length *breadth);
	} 
}

class Triangle extends Shape{
	int height;
	int breadth;
	
	Triangle(int height,int breadth){
		this.height = height;
		this.breadth = breadth;
	}
	void calculateArea() {
		System.out.println("Area of the Triangle is : "+0.5 * height*breadth);
	} 
}
 

public class Assignment_01 {

	public static void main(String[] args) {
		
		Shape rect = new Rectangle(5,10);
		rect.calculateArea();
		
		Shape circle = new Circle(10);
		circle.calculateArea();
		
		Shape tri = new Triangle(10,5);
		tri.calculateArea();
	}

}
