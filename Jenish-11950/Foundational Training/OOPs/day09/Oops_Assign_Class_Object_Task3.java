package com.jenish.day09;

class Box{
	float height;
	float width;
	float breath;
	float volume;
	float area;

	Box(float height,float width,float breath) {
		this.height=height;
		this.width=width;
		this.breath=breath;
	}
	float getvolume() {
		 volume=height*width*breath;
		 return volume;
	}
	float getarea() {
		area=2*(breath*width+breath*height+width*height);
		return area;
	}
	void display() {
		System.out.println("Volume: "+getvolume());
		System.out.println("Area: "+getarea());
		
	}
}

public class Oops_Assign_Class_Object_Task3 {

	public static void main(String[] args) {
		Box obj_1=new Box(2.0f,3.0f,4.0f);
		obj_1.display();
		Box obj_2=new Box(3.0f,4.0f,5.0f);
		obj_2.display();
	}

}
