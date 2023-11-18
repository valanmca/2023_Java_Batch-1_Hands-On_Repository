package Core_Topic_Domnic_Day_6;

class Shape{
	void calculateArea(){
		System.out.println("Area of Shapes");
	}
}
class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area of Circle is Pi*r^2");
	}
}
class Rectangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Rectangle is l*b");
	}
}
class Triangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Triangle is (b*h)/2");
	}
}

public class Assg_1 {

	public static void main(String[] args) {
     Triangle obj=new Triangle();
     obj.calculateArea();
     
     Rectangle obj1=new Rectangle();
     obj1.calculateArea();
     
     Circle obj2=new Circle();
     obj2.calculateArea();
	}

}
