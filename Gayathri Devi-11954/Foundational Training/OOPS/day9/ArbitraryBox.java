package com.gayathri.day9;

class Box
{
	int height,width,breath;
	
	Box(int height, int width, int breath)
	{
		this.height = height;
		this.width = width;
		this.breath = breath;
	}
	void getArea() {
		int areaans = (2*height)+(2*width)+(2*breath);
		System.out.println("Area of the box : "+areaans);
	}
	void getVolume() {
		int volumeans = height*width*breath;
		System.out.println("Volume of the box : "+volumeans);
	}
}
public class ArbitraryBox {

	public static void main(String[] args) {
		Box obj = new Box(10,10,10);
		obj.getArea();
		obj.getVolume();

	}

}
