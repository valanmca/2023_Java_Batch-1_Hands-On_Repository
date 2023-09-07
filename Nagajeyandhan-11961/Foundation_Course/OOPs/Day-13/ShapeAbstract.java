//Abstraction(Shapes)

package com.jeyandhan.day13;

abstract class Shape1 { // Abstract class

	abstract void getArea();

	abstract void getAreas();

	void getAreas1() {
		System.out.println("Works");
	}
}

class Rectangle1 extends Shape1 { // sub class
	void getArea() {
		System.out.println("l*b");
	}

	void getAreas() {
		System.out.println("ii");
	}
}

public class ShapeAbstract {

	public static void main(String[] args) {
		Shape1 obj = new Rectangle1(); // [Dynamic Method Dispath (DMD)]

		obj.getArea(); // call by object because of overriding

		obj.getAreas1(); // call by reference

	}

}
