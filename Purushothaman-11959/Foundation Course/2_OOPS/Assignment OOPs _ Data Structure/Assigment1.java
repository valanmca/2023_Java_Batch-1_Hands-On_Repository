package com.purushoth.Assignment;

class Circle{
	private double radius=1.0;
	private String color="red";
	
	Circle(){
	}
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
	  return radius;
	}

	public double getArea() {
		double area=Math.PI*(radius*radius);
		return area;
	}
}
public class Assigment1 {

	public static void main(String[] args) {
		Circle obj=new Circle(7.0);
		System.out.println(obj.getRadius());
		System.out.println(obj.getArea());
		

	}

}
