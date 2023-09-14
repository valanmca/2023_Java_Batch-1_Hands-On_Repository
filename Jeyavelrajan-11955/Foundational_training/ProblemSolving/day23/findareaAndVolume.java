package com.jeyavel.ProblemSolving.day17;

interface shape_plan{
	void area();
	void parameter();
    static double pi = 3.14; 
}
abstract class shapes implements shape_plan{
	
	public abstract void area();
	public abstract void parameter();
	//double s_side ,radius,width,T1side,T2side,T3side,length,breadth;
    
}
class circle extends shapes{
	double s_side;
	circle(double s_side){

		this.s_side = s_side;		
	}
	@Override
	public void area() {
		System.out.println("Area of the circle "+s_side*s_side);
	}
	@Override
	public void parameter() {
		System.out.println("Peremeter of the circle"+2*pi*s_side);
	}
	
	
}

class rectangle extends shapes{
	double length,breadth;
	rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void area() {
		System.out.println("Area of the rectangle: "+length*breadth);
	}
	@Override
	public void parameter() {
		System.out.println("Peremeter of the rectangle: "+2*(length*breadth));
	}
	
	
}

class square extends shapes{
	double s_side;
	square(double s_side){
		this.s_side = s_side;
	}
	@Override
	public void area() {
		System.out.println("Area of the square: "+ s_side*s_side);
	}
	@Override
	public void parameter() {
		System.out.println("Peremeter of the square: "+2*s_side);
	}
	
	
}

class triangle extends shapes{
	double T1side,T2side,T3side,breadth,height;
	triangle(double T1side, double T2side, double T3side,double breadth,double height){
		this.T1side = T1side;
		this.T2side = T2side;
		this.T3side = T3side;
		this.breadth = breadth;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("Area of the triangle: "+(0.5*breadth*height));
	}
	@Override
	public void parameter() {
		System.out.println("Peremeter of the triangle: "+T1side+T2side+T3side);
	}
	
	
}



public class findareaAndVolume {

	public static void main(String[] args) {
		circle cir = new circle(23.09d);
		cir.area();
		cir.parameter();
		square sqr = new square(33.09d);
		sqr.area();
		sqr.parameter();
		triangle tri = new triangle(34.00,65.91,90.45,89.90,45.30);
		tri.area();
		tri.parameter();
	

	}

}
