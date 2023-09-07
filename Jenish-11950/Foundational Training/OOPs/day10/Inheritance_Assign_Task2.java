package com.jenish.day10;

class Rectangle{
	float length;
	float breath;
	float area;
	float perimeter;
	Rectangle(float length,float breath){
		this.length=length;
		this.breath=breath;

	}
	void area() {
		area=(length*breath);
		System.out.println("Area is " +area);
	}
	void perimeter() {
		perimeter=2*(length+breath);
		System.out.println("Perimeter is " +perimeter);
	}
}
class Square extends Rectangle{
	float s;

	Square(float s) {
		super(s, s);
		this.s=s;
		
	}

	/*void area() {
		float area=s*s;
		System.out.println(area);
	}
	void Perimeter() {
		float perimeter=4*s;
		System.out.println(perimeter);
		
	}*/
	

public class Inheritance_Assign_Task2 {

	public static void main(String[] args) {
		Rectangle obj1=new Rectangle(12.0f,15.0f) ;
			obj1.area();
			obj1.perimeter();
		Square obj2 = new Square(2.0f);
				obj2.area();
				obj2.perimeter();
		}
		
	
}
}
