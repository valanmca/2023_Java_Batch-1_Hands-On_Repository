package com.jeban.Assignment3;

class Shape{
	void Calculate_Area() {
		
	}
}
class Circle extends Shape{
	int radius;
	float PI=3.14f;
	Circle(int radius){
		this.radius=radius;
	}
	void Calculate_Area() {
		System.out.println("Area of the Circle:"+PI*radius*radius);
	}
}
class Triangle extends Shape{
	int height;
	int breadth;
	Triangle(int height,int breadth){
		this.height=height;
		this.breadth=breadth;
	}
	void Calculate_Area() {
		System.out.println("Area of Triangle:"+(1/2*height*breadth));
	}
}
class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void Calculate_Area() {
		System.out.println("Area of Triangle:"+(length*breadth));
	}
}

public class Shapes {

	public static void main(String[] args) {
		Circle rad=new Circle(12);
		rad.Calculate_Area();
		Triangle tri=new Triangle(12,10);
		tri.Calculate_Area();
		Rectangle rect=new Rectangle(10,20);
		rect.Calculate_Area();
		
		
	}

}
