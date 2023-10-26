package com.gayathri.day6;
interface VehiclePlan{	// can delcare abstract , public ..... by default it is default scope
	void noOfEngine();
	void noOfWheels();
	void brandName();
}
abstract class Vehicle2 implements VehiclePlan{
	Vehicle2(){
		System.out.println("I am Abstract Class default Constructor");
	}
	Vehicle2(int a){
		System.out.println("I am Abstract Class Parameterized Constructor \na : "+a);
	}
	public void noOfEngine() {
		System.out.println("I have one engine");
	}
	public abstract void noOfWheels();
	public abstract void brandName();
}
class Bike2 extends Vehicle2{
	Bike2(){
		super(5);
	}
	public void noOfWheels() {  
		System.out.println("I have 2 wheels");
	}
	public void brandName() {
		System.out.println("Hero");
	}
}
public class ExInterface {

	public static void main(String[] args) {
		Vehicle2 reference = new Bike2();
		reference.noOfEngine();
		reference.brandName();
		reference.noOfWheels();

	}

}
