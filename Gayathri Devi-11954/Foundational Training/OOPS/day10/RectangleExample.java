package com.gayathri.day10;
class Rectangle
{
	int length,breath;
	
	Rectangle(int length, int breath){
		this.length = length;
		this.breath = breath;
	}
	void getArea()
	{
		System.out.println("\nArea of Rectangle : "+ (length*breath));
	}
	void getPerimeter()
	{
		System.out.println("\nPerimeter of Rectangle : "+(2*(length+breath)));
	}	
}
class Square extends Rectangle
{
	int side;
	
	Square(int side){
		super(side,side);
		this.side = side;
	}
	void getArea1()
	{
		System.out.println("\nArea of square : "+ (side*side));
	}
	void getPerimeter1()
	{
		System.out.println("\nPerimeter of Rectangle : "+(4*side));
	}	
	
}
public class RectangleExample {

	public static void main(String[] args) {
		Square obj = new Square(59);
		obj.getArea();
		obj.getPerimeter();
		obj.getArea1();
		obj.getPerimeter1();
		
		/*
		 * Rectangle rec = new Rectangle(3, 4); rec.getArea(); rec.getPerimeter();
		 */

	}

}
