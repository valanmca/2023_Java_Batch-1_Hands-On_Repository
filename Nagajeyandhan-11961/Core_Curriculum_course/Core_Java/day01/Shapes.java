//Method overriding

package com.jeyandhan.day01;

class Shape{
	
	int length = 10; //variable declaration
	int breadth = 5;
	int side = 4; 
	
	public void getArea(){ // method
		System.out.println("All Shapes have area");
	}
}

class Rectangle extends Shape { // Hierarchical inheritance
	
	public void getArea() { //method overriding
		
		System.out.println("\nArea of Rectangle is: " + ( length * breadth));
	}
}

class Square extends Shape{
	
	public void getArea() { // method overriding
		
		System.out.println("\nArea of Square is: " + ( side * side));
	}
}

public class Shapes {

	public static void main(String[] args) {
		
		System.out.println("\n\t ***Area of Rectangle***");
		Rectangle rect = new Rectangle (); // object creation
		
		rect.getArea(); // method calling
		
		System.out.println("\n\t ***Area of Square***");
		Square sqr = new Square (); //object creation
		
		sqr.getArea(); // method calling
		
	}

}
