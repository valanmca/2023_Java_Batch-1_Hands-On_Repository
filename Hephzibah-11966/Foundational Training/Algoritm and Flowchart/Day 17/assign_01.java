package integers;

	class Circle{
	 private double radius = 1.0;
	 private String color = "red";
	 
	 Circle() {
	 }
	 
	 Circle(double r){
		 this.radius = r;
	 }

	 public double getRadius() {
		 return radius;
	 }

	 public String getColor() {
		return color;
	 }
	 public double getArea() {
		 return (Math.PI*(radius*radius));
	 }
	 
	}

	public class assign_01{

	 public static void main(String[] args) {
	 
	 Circle circle = new Circle();
	 System.out.println("Area : "+circle.getArea());
	 }
	}


