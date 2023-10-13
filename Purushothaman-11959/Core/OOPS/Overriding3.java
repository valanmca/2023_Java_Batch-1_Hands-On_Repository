package revision.oops;

class Shape{
	public void getArea() {
		System.out.println("Area of all shapes");
	}
}

class Rectangle extends Shape{
	int a=5,b=8;
	public void getArea() {
		System.out.println("Area of rectangle: "+(a*b));
	}
}
public class Overriding3 {

	public static void main(String[] args) {
     Rectangle rectangle=new Rectangle();
     rectangle.getArea();
	}

}