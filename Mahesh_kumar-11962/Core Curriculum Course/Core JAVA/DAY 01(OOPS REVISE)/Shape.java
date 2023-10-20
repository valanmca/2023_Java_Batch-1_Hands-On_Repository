package com.mahesh.core_java;

class Figure
{
	void getArea()
	{
		System.out.println("Every shapes have separate formula for getting area of shapes");
	}
}
class rectangle extends Figure
{
	void getArea()
	{	super.getArea();
		System.out.println("Rectangle have 4 side");
	}
}

class triangle extends rectangle
{
	void getArea()
	{   super.getArea();
		System.out.println("triangle have 3 side");
	}

}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle side = new triangle();
		side.getArea();

	}

}
