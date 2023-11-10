package oops_1;

class Shape{
	public void getArea() {
		System.out.println("Area of the shapes");
	}
}
class Rectangle extends Shape{
	int l,b;
	
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}
	public void getArea() {
		System.out.println("Area of Rectangle:"+(l*b));
	}
}

public class override_shape {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(2,5);
		rect.getArea();

	}

}
