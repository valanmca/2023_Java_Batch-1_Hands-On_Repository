//Using Over riding Method
package com.pravinkumar.day14;

//super keywords for declaraing the constructors from the super class and the sub class
class Shape9 {
	int length;
	int breadth;
	float ratio;
	int areas;

	Shape9(int length, int breadth, float ratio, int areas) {
	 this.length = length;
		this.breadth = breadth;
		this.ratio = ratio;
		this.areas = areas;
		System.out.println("Prints the values ");
	}

	void area() {
		System.out.println("Can not we find the area ");
	}
}

class Rectangle9 extends Shape9 {

	Rectangle9() {
		super(3, 2, 5.0f, 10);
	}

	void area() {

		System.out.println("We can find the area through (L*B) : " + (length * breadth));
	}
}

class Square extends Shape9 {
	Square() {
		super(2, 3, 5.0f, 10);
	}

	void area() {
		System.out.println("We can find the area through (a^2) : " + (areas ^ 2));
	}
}

class triangle extends Shape9 {
	triangle() {
		super(3, 2, 5.0f, 10);
	}

	void area() {
		System.out.println("We can find the area through (3.14*r^2) : " + (3.14 * (ratio * 2)));
	}
}

public class Polymorphism_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape9 obj = new Rectangle9();
		obj.area();
		Shape9 obj1 = new triangle();
		obj1.area();
		Shape9 obj2 = new Square();
		obj2.area();
	}

}
