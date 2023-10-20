//Abstract class using object

abstract class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}

	abstract void noOfWheel();

	abstract void brandName();

}

class Bike extends Vehicle {
	void noOfWheel() {
		System.out.println("I have a Two Wheels");
	}

	void brandName() {
		System.out.println("Honda");
	}
}

public class Abstract_Class_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();
	}

}
