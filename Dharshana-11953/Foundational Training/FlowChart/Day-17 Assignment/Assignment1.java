package com.dharshu.ass;
class Circle{
	private double radius=1.5;
	private String color="red";
	
	Circle(){
		
	}
	public Circle(double r)
	{
		this.radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		double area=3.14*radius*radius;
		return area;
	}
}


public class Assignment1 {

	public static void main(String[] args) {
		Circle circle=new Circle();
		double radius=circle.getRadius();
		double area=circle.getArea();
		System.out.println("The Radius is:"+radius);
		System.out.println("The Area is:"+area);
		
	}

}
