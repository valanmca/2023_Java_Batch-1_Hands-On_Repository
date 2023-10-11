//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a Rectangles.
class Shape {
	int length;
	int width;

	void getArea() {
		System.out.println("Area of the Shape should not determined");
	}
}

class Rectangle extends Shape {
	int length;
	int width;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void getArea() {
		System.out.println("The area of the Rectangle is : " + (length * width));
	}
}

public class Oops_Example5 {

	public static void main(String[] args) {

		Rectangle Rectangle = new Rectangle(1, 3);
		Rectangle.getArea();

	}
}
