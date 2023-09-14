package com.madhan.day13;

class Shapes
{
	void area()
	{
		System.out.println("We cannot define shape value");
	}
}

class Rectangle extends Shapes
{
	void area()
	{
		System.out.println("We can perform using Length*Breadth");
	}
}

class Circle extends Shapes
{
	void area()
	{
		System.out.println("We can perform 3.14*r*r");
	}
}

public class AbstractionExample1 {

	public static void main(String[] args) {
		Rectangle cir=new Rectangle();
		cir.area();
	    Shapes s=new Circle();
		s.area();

	}

}
