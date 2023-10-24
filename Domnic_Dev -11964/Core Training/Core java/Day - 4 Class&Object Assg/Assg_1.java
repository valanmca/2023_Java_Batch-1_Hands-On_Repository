package Core_Topic_Domnic_Day_4;

abstract class Shapes {
	public abstract double Area();

	public abstract double Perimeter();
	
	double pi=3.14;
}

class Rectangle extends Shapes {
	int length, breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double Area() {
		int area= (length * breadth);
		return area;
		
	}

	public double Perimeter() {
		int perimeter=(2 * (length + breadth));
		return perimeter;
	}
}

class Triangle extends Shapes {
	
    int side1,side2,side3,b,h;
    
    Triangle(int side1,int side2,int side3,int b,int h){
    	this.side1=side1;
    	this.side2=side2;
    	this.side3=side3;
    	this.b=b;
    	this.h=h;

    }
    
	public double Area() {
		double area=(b*h)/2;
		return area;
	}

	public double Perimeter() {
		double perimeter=side1+side2+side3;
		return perimeter;
	}
}

class Circle extends Shapes {
    double r;
    
    Circle(double r){
    	this.r=r;
    }
	public double Area() {
		double area=pi*(r*r);
		return area;
	}

	public double Perimeter() {
		double perimeter=2*pi*r;
		return perimeter;
	}
}

public class Assg_1 {

	public static void main(String[] args) {
     Shapes obj1=new Rectangle(3,4);
     System.out.println("Area of Rectangle is : "+obj1.Area());
     System.out.println("Perimeter of Rectangle is : "+obj1.Perimeter());
     
     System.out.println();
     
     Shapes obj2=new Triangle(5,5,5,5,7);
     System.out.println("Area of Triangle is : "+obj2.Area());
     System.out.println("Perimeter of Triangle is : "+obj2.Perimeter());

     System.out.println();
     
     Shapes obj3=new Circle(5.15);
     System.out.println("Area of Triangle is : "+obj3.Area());
     System.out.println("Perimeter of Triangle is : "+obj3.Perimeter());

	}

}
