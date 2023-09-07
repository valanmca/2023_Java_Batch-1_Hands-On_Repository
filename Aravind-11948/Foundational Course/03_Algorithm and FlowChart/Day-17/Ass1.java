package com.aravind.day17ass;
class Circle{
	private double radius;
	private String color;
	
	public Circle()
	{
		radius=1.0;
		color="red";
		
	}
	public Circle(double radius )
	{
		this.radius =radius ;
	}
	
	public double  getRadius()
	{
		return  radius;
		
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	
}

public class Ass1 {

	public static void main(String[] args) {
		Circle obj=new Circle(4.0d);
		System.out.println("Radius="+obj.getRadius());
		System.out.println("Area="+obj.getArea());
		

	}

}
