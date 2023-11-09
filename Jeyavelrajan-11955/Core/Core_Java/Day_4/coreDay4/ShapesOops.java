package com.jeyavel.coreDay4;

abstract class Shapes{
   abstract double perimeter();
    abstract double area();
    public double radius = 7.5;
    public double at =10;
    public double bt =20;
    public double ct =10;
    public double s;
    public double rl = 23;
    public double rb = 12;
    
    
	
}
class circle extends Shapes{
	double area() {
		System.out.println("Area of the circle"+2 * Math.PI * radius);
		return radius;
	}
    double perimeter() {
		System.out.println("Parameter of the circle"+ Math.PI * radius * radius);
		return radius;
	}

}

class triangle extends Shapes{
	double area() {
		s = (at + bt + ct)/2;
		System.out.println("Area of the triangle"+Math.sqrt(s*(s-at)*(s-bt)*(s-ct)));
		return radius;
	}
    double perimeter() {
		System.out.println("Parameter of the triangle"+ at+bt+ct);
		return radius;
	}

}

class rectangle extends Shapes{
	double area() {
		System.out.println("Area of the rectangle"+(rl*rb));
		return radius;
	}
    double perimeter() {
		System.out.println("Parameter of the rectangle"+2*(rl*rb));
		return radius;
	}

}


public class ShapesOops {
	

	public static void main(String[] args) {
          Shapes cir = new circle();
          cir.area();
          cir.perimeter();
          Shapes tri = new triangle();
          tri.area();
          tri.perimeter();
          Shapes rec = new rectangle();
          rec.area();
          rec.perimeter();

	}

}
