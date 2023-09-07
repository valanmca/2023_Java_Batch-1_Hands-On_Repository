package com.matthew.day09;

public class Box {
	float height;
	float width;
	float breadth;
	Box(float height,float width,float breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
		
	}
	
	void getVolume(){
		System.out.println("Volume of Box : "+ (height*width*breadth));
	}
	
	void getArea() {
		System.out.println("Surface Ares of Box : "+((2*height)+(2*width)+(2*breadth)));
	}
	public static void main(String[] args) {
		Box box1 = new Box(34.2f,67.4f,21.1f);
		Box box2 = new Box(43.1f,35.2f,39.45f);
		box1.getVolume();
		box1.getArea();
		box2.getVolume();
		box2.getArea();
	}
}
