package Day_7;

abstract class Vehicle{
	void noOfEngine(){
		System.out.println("I have one Engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
	
}
class Bike extends Vehicle{
	void noOfWheels() {
		System.out.println("Two Wheels");
	}
	
	void brandName() {
		System.out.println("Honda");
	}
}
public class abstrac {

	public static void main(String[] args) {
		Vehicle bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
