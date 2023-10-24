package Core_Topic_Domnic_Day_1;

class Shape{
	void getArea() {
		System.out.println("Area of shapes");
	}
}

class Rectangle extends Shape{
	int l=2;
	int b=3;
	void getArea() {
		System.out.println("Area of rectangle "+(l*b));
	}
}
public class Overriding3 {

	public static void main(String[] args) {
    Rectangle rec=new Rectangle();
    rec.getArea();
	}

}
