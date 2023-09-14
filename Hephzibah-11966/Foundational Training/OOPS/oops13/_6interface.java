package oops13;

interface Vehicleplan1 { // by default interface class are abstract class
	public void engine();

	public void wheel();

	public void brandname();

}

abstract class Vehicle3 implements Vehicleplan1 { // Interface method all are default public abstract
	public void engine() {
		System.out.println("All Vehicles have one engine");
	}

	public abstract void wheel();

	public abstract void brandname();
}

class Bike1 extends Vehicle3 { // Interface method all are default public abstract
	public void wheel() {
		System.out.println("two wheels");
	}

	public void brandname() {
		System.out.println("HONDA");
	}
}

public class _6interface {

	public static void main(String[] args) {
		Vehicle3 obj = new Bike1();
		obj.wheel();
		obj.brandname();

		Vehicleplan1 obj1;

	}

}
