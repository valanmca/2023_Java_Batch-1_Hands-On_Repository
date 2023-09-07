package com.jeban.Assignment;

class Circle{
	private double radius=1.0;
	private String Colour="Red";
	
	Circle() {
	}
	Circle(double radius){
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//	public String getColour() {
//		return Colour;
//	}
//	public void setColour(String colour) {
//		Colour = colour;
//	}
	public double getArea() {
		double area=Math.PI*(radius*radius);
		return area;
	}
	
	
	
	
}

public class Problem1 {

	public static void main(String[] args) {
		Circle obj=new Circle(5.0);
		System.out.println(obj.getRadius());
		System.out.println(obj.getArea());
		
		

	}

}
