package com.naveen.day2_1;
/*Shape */

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
	  private float length;
	  private float width;

	  Rectangle(float length, float width) {
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

class Circle extends Shape {
	  private double radius;

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  public double getArea() {
	    return Math.PI * radius * radius;
	  }

	  public double getPerimeter() {
	    return 2 * Math.PI * radius;
	  }
	}

class Triangle extends Shape {
	  private double side1;
	  private double side2;
	  private double side3;

	  public Triangle(double side1, double side2, double side3) {
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


public class Ex01_Shape {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(10, 12);
	    Shape circle = new Circle(5);
	    Shape triangle = new Triangle(7, 8, 6);
	    
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
