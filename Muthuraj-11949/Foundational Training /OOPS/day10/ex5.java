package com.muthu.day10;
class Rectangle{
	int length;
	int breadth;
	Rectangle(int length,int brath){
	      this.length=length;
	      this.breadth=breadth;
	}
	int getArea(){
		int area= length*breadth;
		return area;	
	}
	int getPerimeter() {
		int perimeter=2*(length+breadth);
		return perimeter;
	}
	}
	
	class Square extends Rectangle{
		int side;
		Square(int length,int breath,int side){
			super(length,breath);
			this.side=side;
		}
		void display() {
			System.out.println("Area of square:"+(side*side));
			System.out.println("perimeter of square:"+(4*side));
			System.out.println("Area of rectangle:"+getArea());
			System.out.println("perimeter of rectangle:"+getPerimeter());
		}
		
		
	}	

public class ex5 {
public static void main(String[] args) {
	Square obj1=new Square(10,20,5);
	obj1.display();
		

	}

}
