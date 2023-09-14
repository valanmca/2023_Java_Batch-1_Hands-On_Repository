package com.swetha.day25;

interface ShapePlan{
	void area();
	void perimeter();
	
}
abstract class shape implements ShapePlan{
	
	public abstract void area();
	public abstract void perimeter();
	
}
class circle extends shape {
	int radius;
	circle(int radius){
		this.radius=radius;
	}
	public void area() {
		System.out.println("Area of circle  is : "+ 3.14*radius*radius);
	}
	public void perimeter() {
		System.out.println("Perimeter of circle is : "+2*3.14*radius);
	}
}
class rectangle extends shape{
	int length;
	int breadth;
	
	rectangle(int length,int breadth ){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void area() {
		System.out.println("Area of rectangle is : "+length*breadth);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of rectangle is :"+ 2*(length+breadth));
	}
}
class square extends shape {
	int side;
	square(int side){
		this.side=side;
	}
	public void area() {
		System.out.println("Area of square is : "+side*side);
	}
	public void perimeter() {
		System.out.println("Perimeter of square is : "+ 4* side);
	}
}
class triangle extends shape{
	int base,height,length;
	
	triangle(int base,int height,int length){
		this.base=base;
		this.height=height;
		this.length=length;
	}
	public void area() {
		System.out.println("Area of triangle is : "+ 1/2*(base*height));
	}
	public void perimeter() {
		System.out.println("Perimeter of triangle is : "+ (base+height+length));
	}
}

public class DifferentShape {

	public static void main(String[] args) {
		circle cir=new circle(5);
		cir.area();
		cir.perimeter();
		
		rectangle rect=new rectangle(4,5);
		rect.area();
		rect.perimeter();
		
		square sq=new square(5);
		sq.area();
		sq.perimeter();
		
		triangle tri=new triangle(2,4,5);
		tri.area();
		tri.perimeter();

	}

}
