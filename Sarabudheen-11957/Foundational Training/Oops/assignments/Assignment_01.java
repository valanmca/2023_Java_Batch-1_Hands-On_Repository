package com.sara.assignments;

class Circle{
	private double radius = 1.0;
	private String color = "Red";
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius = radius;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = Math.PI*(radius * radius);
		return area;
	}
}

public class Assignment_01 {

	public static void main(String[] args) {
		Circle obj=new Circle(1);
		System.out.println(obj.getArea());
		

	}

}
