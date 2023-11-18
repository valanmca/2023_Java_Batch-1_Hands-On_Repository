package Core_Topic_Domnic_Day_7;

interface VehiclePlan{   //by default its abstract
	void noOfEngine();
	void noOfWheels();  //by default its public & abstract
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan{
	
	
	public void noOfEngine() {
		System.out.println("I have One engine");
	}
	public abstract void noOfWheels();
	public abstract void brandName();

}
class Bike1 extends Vehicle1{
	
	public void noOfWheels() {
		System.out.println("I Have two wheels");
	}
	public void brandName() {
		System.out.println("Hero");
	}
}
public class interface_1 {

	public static void main(String[] args) {
		 Vehicle1 bike =new Bike1();
	     bike.noOfEngine();
	     bike.noOfWheels();
	     bike.brandName();
	}

}
