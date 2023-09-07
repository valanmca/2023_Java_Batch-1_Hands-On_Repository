package Assignment;

class Circle {
	private double radius = 1.0;
	private String color = "red";
	double area;
	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

public double getArea()
{
	area = Math.PI*this.radius*this.radius;
	return area;
}
}

public class ex1uml {

	public static void main(String[] args) {
		
		Circle obj=new Circle(0.7);
		System.out.println(obj.getRadius());
		System.out.println(obj.getArea());
  
	}
}
