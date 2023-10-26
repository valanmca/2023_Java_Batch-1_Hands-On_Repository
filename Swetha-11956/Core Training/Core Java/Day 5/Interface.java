package JavaOops5;

interface VehiclePlan{  //Default public, abstract
	void noOfEngine();
	void noOfwheels();
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan{
	public void noOfEngine() {
		System.out.println("I have engine");
	}
	public abstract void noOfwheels();
	public abstract void brandName();
}
class Bike1 extends Vehicle1{
	
	public void noOfwheels(){
		System.out.println("I have two wheels");
	}
	public void brandName() {
		System.out.println("Honda");
	}
}

public class Interface {
	

	public static void main(String[] args) {
		VehiclePlan bike=new Bike1();
		bike.noOfEngine();
		bike.noOfwheels();
		bike.brandName();

	}

}
