//Abstract method
package com.matthew.day13;
//if we use normal class we have to {} for method to use abstract method the class also use abstract 
// we are not using {} because there is no operation and to avoid memory
// declaring as abstract because it has no 
//Abstract - method without body
//class extending the abstract class must override all the method in the abstract class
//Abstraction is depending on inheritance and overloading.
//we can both define and declare a method
// abstract class can have both abstract method + concrete method
//cannot create object for abstract class
//abstract class is partially class
// for abstract class we cannot create an object but we can create an reference
abstract class Shape1{
	
	abstract void area();//abstract method
	abstract void myMethod();
	
	void myMethod1() {//concrete method
		System.out.println("myMethod1 in abstract class shape1");
	}
	
	void myMethod(int a,int b ) {
		System.out.println("sum :"+(a+b));
	}
}

class Rectangle1 extends Shape1{
	void area() {
		System.out.println("Area of rectangle is l*b");
	}
	
	void myMethod() {
		
	}
}

class Circle1 extends Shape1{
	void area() {
		System.out.println("Area of circle is 3.14*(r*r)");
	}
	
	void myMethod() {
			
		}
}
public class Assessment2Abstract {
	public static void main(String[] args) {
		//creating an object for abstract class
		
		// Shape1 shape = new Shape1(); 
		
		//creating reference
		
		Shape1 shape;
		
		//creating object for abstract class using sub class
		
	// reference      object 
	//   |               |	
		Shape1 obj = new Rectangle1(); //DMD - Dynamic Method Dispatch
		obj.area();// Overriding is based on object so it invoke area of rectangle not area in shape
		obj.myMethod1();// non overriding method is based on reference
		obj.myMethod(3,5);
		obj.myMethod();
	}

}
