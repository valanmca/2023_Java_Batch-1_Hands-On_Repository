//Interface
abstract interface VehiclePlan { //interface is a default and public
	abstract void noOfEngine(); // public & abstract method

	void noOfWheel();

	void brandName();
}

abstract class Vehicle1 implements VehiclePlan {
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}

	public abstract void noOfWheel();

	public abstract void brandName();

}

class Bike1 extends Vehicle1 {
	public void noOfWheel() {
		System.out.println("I have a Two Wheels");
	}

	public void brandName() {
		System.out.println("Honda");
	}
}

public class Abstract_Class_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 bike = new Bike1();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();
	}

}