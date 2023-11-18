package Core_Topic_Domnic_Day_7;

abstract class Vehicle{
	
	Vehicle(int a){
		System.out.println("Contructor");
	}
	void noOfEngine() {
		System.out.println("I have One engine");
	}
	abstract void noOfWheels();
	abstract void brandName();

}
class Bike extends Vehicle{
	Bike(){
		super(4);
	}
	void noOfWheels() {
		System.out.println("I Have two wheels");
	}
	void brandName() {
		System.out.println("Hero");
	}
}

public class abstractclass_1 {

	public static void main(String[] args) {
     Vehicle bike =new Bike();
     bike.noOfEngine();
     bike.noOfWheels();
     bike.brandName();
	}

}
