package com.mahesh.Oops_day10;

class Rectangle {
	float length, breath;

	Rectangle(float length, float breath) {
		this.length = length;
		this.breath = breath;
	}

	float area_Rectangle() {
		// float area = length*breath;
		return length * breath;
	}

	float perimeter_Rectangle() {
		// float perimeter = 2*(length+breath);
		return 2*(length + breath);
	}
	
}

class Square extends Rectangle {
	
	float side;
	Square(float length,float breath,float side)
	{
		super(length,breath);
		this.side=side;
	}

	
	float area_Square() {
		float area =side*side;
		return area;
	}

	float perimeter_Square() {
		float perimeter =4*side;
		return perimeter;
	}

	void display_Square()
	{	System.out.println("Area of Rectangle :"+area_Rectangle());
		System.out.println("Perimeter of Rectangle :"+perimeter_Rectangle());
		System.out.println("Area of Square :"+area_Square());
		System.out.println("Perimeter of Square :"+perimeter_Square());
	}
}

public class Inheritance_Shapes {

	public static void main(String[] args) {

		Square sq = new Square(4.5f,5.5f,7.25f);
		sq.display_Square();
		
	}

}
