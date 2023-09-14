package com.mahesh.Oops_day13;

class Shape{
	
	
	void area()
	{
		System.out.println(" No formula for this type ");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		
		System.out.println(" Area for Rectangle : (l*b)");
		
	}
}
class Circle extends Shape
{
	
	void area()
	{
	
		System.out.println(" Area for Circle : ( Math.PI*(r*r) )");
	}
}



public class Find_Area {

	public static void main(String[] args) {

		Shape sh = new Shape();
		sh.area();
		
		Rectangle rec =new Rectangle();
		rec.area();
		
		Circle ar_formula = new Circle();
		ar_formula.area();
	}

}
