package com.oops;
class shape {
	
	
	void getArea()
	{
		System.out.println("going to find area ");
	}
	
}

class rectangle extends shape{
	int a=10,b=20;
	void getArea()
	{
		System.out.println("Area of rectangle :"+a*b);
	}
	
}

public class overridingShapes {

	public static void main(String[] args) {
		shape obj=new rectangle();
		obj.getArea();
		
	}

}
