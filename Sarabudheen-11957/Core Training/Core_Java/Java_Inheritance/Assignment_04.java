package com.sara.CoreJava.Day_06;

class Shape1{

	//method
	
	void getArea() {
		System.out.println("Area of the Shape");
	}
	
	void getPerimeter() {
		System.out.println("Perimeter of the Shape");
	}
}

class Circle1 extends Shape1{
	//Variables
	int radius;
	
	Circle1(int radius){
		this.radius = radius;
	}
	
	void getArea() {
		System.out.println("Area of the circle is : "+ 3.14 * radius * radius);
	} 
	
	void getPerimeter() {
		System.out.println("Perimeter of the circle is : "+2 * 3.14 * radius);
	}
}

class Rectangle1 extends Shape1{
	int length;
	int breadth;
	
	Rectangle1(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void getArea() {
		System.out.println("Area of the Rectangle is : "+length *breadth);
	} 
	
	void getPerimeter() {
		System.out.println("Perimeter of the Rectangle is : "+2 *(length + breadth));
	}
}

class Triangle1 extends Shape1{
	int height;
	int breadth;
	int side;
	
	Triangle1(int height,int breadth,int side){
		this.height = height;
		this.breadth = breadth;
		this.side = side;
	}
	void getArea() {
		System.out.println("Area of the Triangle is : "+0.5 * height*breadth);
	} 
	
	void getPerimeter() {
		System.out.println("Perimeter of the Triangle is : "+(height+breadth+side));
	}
}
public class Assignment_04 {

	public static void main(String[] args) {
		
		Shape1 rect = new Rectangle1(5,10);
		rect.getArea();
		rect.getPerimeter();
		
		Shape1 circle = new Circle1(10);
		circle.getArea();
		circle.getPerimeter();
		
		Shape1 tri = new Triangle1(10,5,5);
		tri.getArea();
		tri.getPerimeter();
	}

}
