package com.mahesh.core_java_day_04;

import java.text.DecimalFormat;
import java.util.*;

abstract class Shape {
	abstract void area();

	abstract void perimeter();

	Scanner sc = new Scanner(System.in);
    DecimalFormat decfor = new DecimalFormat("0.00");  
}
	class Circle extends Shape {
		float radious;

		void area() {
			System.out.println("Circle\n------");
			System.out.println("Enter the radious : ");
			radious = sc.nextFloat();
			System.out.println("Area of Circle : " +decfor.format(Math.PI * Math.sqrt(radious)) );
		}

		void perimeter() {
		
			System.out.printf("Perimeter of Circle : " + decfor.format(2 * (Math.PI * radious)));

		}
	}

	class Rectangle extends Shape {
		
		float length,height;
		void area() {
			System.out.println("\nRectangle\n---------");
			System.out.println("Enter the length : ");
			length = sc.nextFloat();
			System.out.println("Enter the height : ");
			height = sc.nextFloat();
			System.out.println("Area of Rectangle : " + (length*height));
		}

		void perimeter() {
			System.out.println("Perimeter of Rectangle : " + 2 * (length+height));


		}
	}

	class Triangle extends Shape {
		float base,height,side1,side2,side3;
		void area() {
			System.out.println("\nTriangle Area\n-------- ----");
			System.out.println("Enter the Base : ");
			base = sc.nextFloat();
			System.out.println("Enter the height : ");
			height = sc.nextFloat();
			System.out.println("Area of Rectangle : " + (0.5*base*height));
		}

		void perimeter() {
			System.out.println("\nTriangle Primeter\n-------- --------");
			System.out.println("Enter the 1st side : ");
			side1= sc.nextFloat();
			System.out.println("Enter the 2nd side : ");
			side2 = sc.nextFloat();
			System.out.println("Enter the 3rd side : ");
			side3 = sc.nextFloat();
			System.out.println("Perimeter of triangle : " + (side1+side2+side3));

		}
	}

public class figure {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle show_round = new Circle();
		show_round.area();
		show_round.perimeter();
		
		
		Rectangle show_box = new Rectangle();
		show_box.area();
		show_box.perimeter();
		
		
		Triangle show_cone = new Triangle();
		show_cone.area();
		show_cone.perimeter();

	}

}
