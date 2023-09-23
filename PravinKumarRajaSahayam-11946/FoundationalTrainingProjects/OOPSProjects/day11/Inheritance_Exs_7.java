/*Create a class named "Rectangle" with two data members "Length" and "Breadth" and two methods to print the area and perimeter of the rectangle respectively.Its constructors having parameter for length and breadth
is used to initialize length and breadth of the rectangle.
Let class "Square" inherits the "Rectangle" class with its constructors having a parameter for this its side
(Suppose s) calling the constructors of its parents class  as "super(s,s)".Print the area and perimeter of a rectangle and a square.*/
package com.pravinkumar.day11;

//Using Inheritance Method
class Rectangle {
	float length;
	float breadth;

	Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	float getArea() {
		float area = (breadth * length);
		return area;
	}

	float getPerimeter() {
		float perimeter = 2 * (length * breadth);
		return perimeter;
	}

	void Area() {
		System.out.println("The Rectangle Area is : " + getArea());
	}

	void Perimeter() {
		System.out.println("The Rectangle Perimeter is : " + getPerimeter());
	}
}

class Square extends Rectangle {

	Square(float length, float breadth) {
		super(length, breadth);
		this.length = length;
		this.breadth = breadth;
	}

	float getArea() {
		float area = (breadth * length);
		return area;
	}

	float getPerimeter() {
		float perimeter = 2 * (length * breadth);
		return perimeter;
	}

	void Area() {
		System.out.println("The Square Area is : " + getArea());
	}

	void Perimeter() {
		System.out.println("The Square Perimeter is : " + getPerimeter());
	}

}

public class Inheritance_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj = new Square(3, 5);
		obj.Area();
		obj.Perimeter();

		Rectangle objects = new Rectangle(2, 3);
		objects.Area();
		objects.Perimeter();
	}

}
