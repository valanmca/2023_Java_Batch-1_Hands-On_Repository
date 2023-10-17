//Write a Java Programs to create a base class shape with a method called calculateArea().Create three subclases: circle,rectangle,and,triangles. override the calculateArea() method in each subclass to calculate and return the shape's area.
class Shape {
	void calculateArea() {
		System.out.println("All the Shape have separate area sizes");
	}
}

class Circle extends Shape {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	void calculateArea() {
		System.out.println("Area of the circle is : " + " " + (3.14 * (radius * radius)));
	}
}

class Rectangle extends Shape {
	int length;
	int width;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void calculateArea() {
		System.out.println("Area of the rectangle is : " + " " + (length * width));
	}
}

class Triangle extends Shape {
	int breadth;
	int height;
	int side;
	int base;

	Triangle(int breadth , int height , int side , int base) {
		this.breadth = breadth;
		this.height = height;
		this.side = side;
		this.base = base;
	}

	void calculateArea() {
		int s = (breadth + height + side) /2;
		int a = ((s*(s-breadth)*(s-height)*(s-side))*(s*(s-breadth)*(s-height)*(s-side)));
		System.out.println("Area of the Triangle is : " + " " + a);
	}
}

public class Inheritance_Example13 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Circle circle = new Circle(3);
		circle.calculateArea();
		Rectangle rectangle = new Rectangle(2, 5);
		rectangle.calculateArea();
		Triangle triangle = new Triangle(1, 4 , 8 , 6);
		triangle.calculateArea();
	}

}
