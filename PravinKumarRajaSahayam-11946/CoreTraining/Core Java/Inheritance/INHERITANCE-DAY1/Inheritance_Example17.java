//Write a Java Programs to create a class Shpae with methods getArea() and getPerimeter() . Create three subclasses : Circle , Rectangle , and , Triangle . Override the getArea() and the getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.
abstract class Shape1 {
	abstract void getArea();

	abstract void getPerimeter();
}

class Circle1 extends Shape1 {
	int radius;

	Circle1(int radius) {
		this.radius = radius;
	}

	public void getArea() {
		System.out.println("Area of the Circle is : " + (3.14 * (radius * radius)));
	}

	public void getPerimeter() {
		System.out.println("Perimeter of the Circle is : " + (2 * (3.14 * radius)));
	}
}

class Rectangle1 extends Shape1 {
	int length;
	int width;

	Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void getArea() {
		System.out.println("Area of the Rectangle is : " + (length * width));
	}

	public void getPerimeter() {
		System.out.println("Perimeter of the Rectangle is : " + (2 * (length + width)));
	}
}

class Triangle1 extends Shape1 {
	int breadth;
	int height;
	int side;
	int base;

	Triangle1(int breadth, int height, int side, int base) {
		this.breadth = breadth;
		this.height = height;
		this.side = side;
		this.base = base;
	}

	public void getArea() {
		int s = (breadth + height + side) /2;
		int a = ((s*(s-breadth)*(s-height)*(s-side))*(s*(s-breadth)*(s-height)*(s-side)));
		System.out.println("Area of the Triangle is : " + a);
	}

	public void getPerimeter() {
		System.out.println("Perimeter of the Triangle is : " + (side + base + side));
	}

}

public class Inheritance_Example17 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Circle1 circle = new Circle1(5);
		circle.getArea();
		circle.getPerimeter();
		Rectangle1 rectangle = new Rectangle1(2, 3);
		rectangle.getArea();
		rectangle.getPerimeter();
		Triangle1 triangle = new Triangle1(1, 4, 6, 8);
		triangle.getArea();
		triangle.getPerimeter();
	}

}
