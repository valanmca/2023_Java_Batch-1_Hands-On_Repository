package com.dharshu.day9;
class box{
	int height;
	int width;
	int breadth;
	
	box(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	void getVolume() {
		System.out.println("Box Height:"+height);
		System.out.println("Box width:"+width);
		System.out.println("Box Breadth:"+breadth);
		int res=height*width*breadth;
		System.out.println("The volume of the box is:"+res);
	}
	void getArea() {
		int ans=(2*height)+(2*width)+(2*breadth);
		System.out.println("\nThe area of the box is:"+ans);
	}
}

public class ArbitraryBox {

	public static void main(String[] args) {
		box obj=new box(2,2,2);
		obj.getVolume();
		obj.getArea();
		

	}

}
