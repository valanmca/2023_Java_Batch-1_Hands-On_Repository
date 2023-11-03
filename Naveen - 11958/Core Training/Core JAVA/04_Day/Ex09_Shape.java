package com.naveen.day4;

/*4. Write a Java program to create a class Shape with methods getArea() and getPerimeter(). 
 * Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() methods 
 * in each subclass to calculate and return the area and perimeter of the respective shapes.*/

abstract class Shape1 {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle1 extends Shape1 {
	  private float length;
	  private float width;

	  Rectangle1(float length, float width) {
	    this.length = length;
	    this.width = width;
	  }
	  
	  public double getArea() {
	    return length * width;
	  }
	  public double getPerimeter() {
	    return 2 * (length + width);
	  }
	}

class Circle1 extends Shape1 {
	  private double radius;

	  public Circle1(double radius) {
	    this.radius = radius;
	  }

	  public double getArea() {
	    return Math.PI * radius * radius;
	  }

	  public double getPerimeter() {
	    return 2 * Math.PI * radius;
	  }
	}

class Triangle1 extends Shape1 {
	  private double side1;
	  private double side2;
	  private double side3;

	  public Triangle1(double side1, double side2, double side3) {
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	  }

	  public double getArea() {
	    double s = (side1 + side2 + side3) / 2;
	    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	  }

	  public double getPerimeter() {
	    return side1 + side2 + side3;
	  }
	}


public class Ex09_Shape {

	public static void main(String[] args) {
		
		Shape1 rectangle = new Rectangle1(10, 12);
	    Shape1 circle = new Circle1(5);
	    Shape1 triangle = new Triangle1(7, 8, 6);
	    
	    System.out.println("\nRectangle: ");
	    System.out.println("----------");
	    System.out.println("Area :" +rectangle.getArea());
	    System.out.println("Perimeter :" +rectangle.getPerimeter());
	    
	    System.out.println("\nCircle: ");
	    System.out.println("-------");
	    System.out.println("Area :" +rectangle.getArea());
	    System.out.println("Perimeter :" +rectangle.getPerimeter());
	    
	    System.out.println("\nTriangle: ");
	    System.out.println("---------");
	    System.out.println("Area :" +rectangle.getArea());
	    System.out.println("Perimeter :" +rectangle.getPerimeter());
	    

	}

}
