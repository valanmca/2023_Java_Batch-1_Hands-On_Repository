package oops13;
abstract class Shape{
	abstract void area(); //Abstract method is also a method without declaring the body 
	abstract void myMethod();	                   //declare as method not for implement
	             //the class which are mention in abstract method, they have to override
}
class Rectangle extends Shape{
	void area() {
		int l=10,b=5;
		int a=l*b;
		System.out.println(a);
	}
}
class Circle extends Rectangle{
	void area() {
		int r=2;
		float a=3.14f*r*r;
		System.out.println(a);
	}
}



public class _2areaa {

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.area();
		

	}}


