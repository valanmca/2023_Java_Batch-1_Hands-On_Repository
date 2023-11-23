package Day7;
abstract class Vehicle{
	Vehicle(int a){
		System.out.println("Constructor");
	}	
	void noOfEngine() {
		System.out.println("I have One engine ");
	}
	abstract void noOfWheel();
	abstract void brandname();
}
class Bike1 extends Vehicle { 
	Bike1(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	void noOfwheel() {
		System.out.println("Bike has two wheel");
	}
	void brandName() {
		System.out.println("PULSAR");
	}	
}
public class Abstract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Bike1=new Bike1();
		Bike1. noOfWheel();
		Bike1. brandname();
		Bike1. noOfEngine();

	}

}
