package com.swetha.day9;

public class Box {
	int height;
	int breadth;
	int length;
	
	//constructors
	Box(int height,int breadth,int length){   //Initialization
		this.height=height;
		this.breadth=breadth;
		this.length=length;
	}
	int getArea() {                          //Method for calculating surface area
		int area=(2*length)+(2*breadth)+(2*height);
		return area;
	}
	int getVolume() {                       //Method for calculating volume
		int vol=length*breadth*height;
		return vol;
	}
	void display() {                        //Method for printing the are and volume
		System.out.println("The surface area is : "+getArea());
		System.out.println("The volume is : "+getVolume());
	}

	public static void main(String[] args) {
		Box obj=new Box(2,3,4);
		obj.display();
		
		Box obj1=new Box(1,2,3);
		obj1.display();
		
	}

}
