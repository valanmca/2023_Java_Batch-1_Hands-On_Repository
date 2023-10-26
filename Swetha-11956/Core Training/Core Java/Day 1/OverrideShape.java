//Method Overriding
//Write a java program to create a class called shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of rectangle.
package oopsDay1_Day2;
class Shape{
	public void getArea() {
		System.out.println("Shape");
	}
}
class Rectangle extends Shape{
	int l, b;
	
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void getArea() {
		
		System.out.println("Areaof rectangle : "+(l*b));
	}
	
}

public class OverrideShape {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(4,5);
		rect.getArea();
	}

}
