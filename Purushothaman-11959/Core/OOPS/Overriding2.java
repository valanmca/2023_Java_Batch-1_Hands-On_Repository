package revision.oops;

class Vehicle{
	public void drive(){
		System.out.println("All vehicles can drive");
	}
}
class Car extends Vehicle{
	public void drive(){
		System.out.println("Repairing a car");
	}
}
class Bike extends Vehicle{
	public void drive(){
		System.out.println("Bike is driving");
	}
}


public class Overriding2 {

	public static void main(String[] args) {
		Car suzuki=new Car();
		suzuki.drive();
		Bike bike=new Bike();
		bike.drive();

	}

}

