package oops10;

class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler {
	void brandname() {
		System.out.println("Brand name Honda");
	}
}

public class inheri1 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandname();

	}

}
