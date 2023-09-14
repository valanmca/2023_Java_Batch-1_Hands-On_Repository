package day_25;
interface ShapePlan {
	void area();
	void perimeter();
}
abstract class Shape implements ShapePlan {
	abstract public void area();
	abstract public void perimeter();
}
class Circle extends Shape{
	float radius;
	Circle(float radius){
		this.radius=radius;
	}
	public void area () {
		System.out.println("Area of Circle :" + (3.14*radius*radius));
	}
	public void perimeter () {
		System.out.println("Perimeter of Circle" + (2*3.14*radius));
	}
}
class Square extends Shape{
	int side;
	Square(int side){
		this.side=side;
	}
	public void area () {
		System.out.println("Area of square :" + side*side);
	}
	public void perimeter () {
		System.out.println("Perimeter of square :" + (4*side));
	}
}
class Rectangle extends Shape{
	int length, breadth;
	Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void area() {
		System.out.println("Area of Rectangle :" +(length * breadth));
	}
	public void perimeter() {
		System.out.println("Perimeter of Rectangle :" +(2*(length+breadth)));  		
	}
}
class Triangle extends Shape{
	int breadth, height, side1, side2, side3;
	Triangle(int breadth, int height, int side1, int side2, int side3) {
		this.breadth=breadth;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public void area() {
		System.out.println("Area of Triangle :" + (0.5*height*breadth));
	}
	public void perimeter() {
		System.out.println("Perimeter of Triangle :" +(side1+side2+side3));  		
	}
}
public class DifferentShapes {
	

	public static void main(String[] args) {
		Circle circle=new Circle(2.5f);
		circle.area();
		circle.perimeter();
		
		Square square=new Square(2);
		square.area();
		square.perimeter();
		
		Rectangle rectangle=new Rectangle(10,5);
		rectangle.area();
		rectangle.perimeter();
		
		Triangle triangle=new Triangle(4,7,3,6,3);
		triangle.area();
		triangle.perimeter();
	}

}
