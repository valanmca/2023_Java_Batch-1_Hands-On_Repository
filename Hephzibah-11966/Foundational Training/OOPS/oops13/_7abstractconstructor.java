package oops13;

abstract class Vehicle2  { 
	Vehicle2(int a){ //by creating variable in constructor... we have to create one empty constructor in bike class
		System.out.println("constructor from abstract class");// Interface method all are default public abstract
	}
	public void engine() {
		System.out.println("All Vehicles have one engine");
	}

	public abstract void wheel();

	public abstract void brandname();
}

class Bike2 extends Vehicle2 {// Interface method all are default public abstract //java does not support mulitle abstract class... 
	                           //so we cannot extends as bike extends vehicle1,vehicle2
	Bike2(){
		super(5);//assigning value for vehicle2 constructor 
	}
	public void wheel() {
		System.out.println("two wheels");
	}

	public void brandname() {
		System.out.println("HONDA");
	}
}

public class _7abstractconstructor {

	public static void main(String[] args) {
		Vehicle2 obj = new Bike2();
		obj.wheel();
		obj.brandname();
		obj.engine();
	}
}
