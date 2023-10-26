package JavaOops4;

class Shape2{
	void calculateArea(){
		System.out.println("Area of the shape");
	}
}
class Circle extends Shape2{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void calculateArea() {
		System.out.println("Area of circle "+3.14f*radius*radius);
	}
}
class Rectangle extends Shape2{
	int length,breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void calculateArea() {
		System.out.println("Area of rectangle is : "+(length*breadth));
	}
	
}
class Triangle extends Shape2{
	int base,height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	void calculateArea() {
		System.out.println("Area of triangle is : "+(0.5*base*height));
	}
	
}
public class Shape {

	public static void main(String[] args) {
		Circle obj1=new Circle(3);
		obj1.calculateArea();
		
		Rectangle obj2= new Rectangle(5,4);
		obj2.calculateArea();
		
		Triangle obj3=new Triangle(4,5);
		obj3.calculateArea();
		
	}

}
