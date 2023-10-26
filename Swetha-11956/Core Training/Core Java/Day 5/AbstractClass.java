package JavaOops5;
//It is possible to define a constructor in abstract class, it will executed by subclass object creation.
//Abstract class= Normal class + Abstract method.
//Abstract method cannot final,static.

abstract class Vehicle{
	Vehicle(int a){
		System.out.println("Constructor");
	}
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
}

class Bike extends Vehicle{
	Bike(){
		super(3);
	}
	void noOfWheels(){
		System.out.println("I have two wheels");
	}
	void brandName() {
		System.out.println("Honda");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Vehicle bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
