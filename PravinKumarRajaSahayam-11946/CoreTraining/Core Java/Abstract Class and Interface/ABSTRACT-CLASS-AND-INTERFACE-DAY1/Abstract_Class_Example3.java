//Abstract class declare constructor
abstract class Vehicle2 {
	Vehicle2(int a) 
	{
		System.out.println("Constructor");
	}
	void noOfEngine() {
		System.out.println("I have one Engine");
	}

	abstract void noOfWheel();

	abstract void brandName();

}

class Bike2 extends Vehicle2 {
	Bike2() 
	{
		super(8);
	}
	void noOfWheel() {
		System.out.println("I have a Two Wheels");
	}

	void brandName() {
		System.out.println("Honda");
	}
}

public class Abstract_Class_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();
	}

}