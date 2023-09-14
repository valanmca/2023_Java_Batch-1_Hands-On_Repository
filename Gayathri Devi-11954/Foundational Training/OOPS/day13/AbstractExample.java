package com.gayathri.day13;

abstract class Shapes {//abstract methods id a collection of abstract methods and concreate methods(Normal methods)
	abstract void area();//only declaration, without body statements
	abstract void myMethod();
	void myNormalMethod() {//normal method in abstract class
		System.out.println("This is normal method");
	}
}

class Rectangles extends Shapes {
	int length, width;

	Rectangles(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void area() {
		System.out.println("The area of rectangle : " + (length * width));
	}
	void myMethod() {
		System.out.println("HAi");
	}
}

/*
 * class Circles extends Shapes { float pi = 3.14f; float r;
 * 
 * Circles(float r) { this.r = r; }
 * 
 * void area() { System.out.println("The area of the circle : " + (3.14 * r *
 * r)); } void myMethod() {
 * 
 * } }
 */
public class AbstractExample {

	public static void main(String[] args) {
		
//		Shapes sh = new Shapes();	//abstract class not allow to create object
//		Shapes sha; //bt allow to create reference.
//		sha.area();
		
		Shapes sha = new Rectangles(2,2);
		sha.myNormalMethod();
		sha.area();
		sha.myMethod();
		
		/*
		 * Circles c = new Circles(5.0f); c.area();
		 * 
		 * Rectangles rec= new Rectangles(3,7); rec.area();
		 */

	}

}
