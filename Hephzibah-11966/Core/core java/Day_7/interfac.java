package Day_7;
//by default interface is abstract and public, so we cannot use static,final. 
//variable, method, constructor
interface VehiclePlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	

abstract class Vehicle implements VehiclePlan{
	public void noOfEngine(){
		System.out.println("I have one Engine");
	}
	public abstract void noOfWheels();
	public abstract void brandName();
	
}
class Bike extends Vehicle{
	public void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
	
	public void brandName() {
		System.out.println("Honda");
	}
}



public class interfac {

	public static void main(String[] args) {
		VehiclePlan bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}}
