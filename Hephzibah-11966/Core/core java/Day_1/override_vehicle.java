package oops_1;

class Vehicle{
	public void drive() {
		System.out.println("Driving a vehicle");
	}
}
class Car{
	public void drive() {
		System.out.println("Repairing a car");
	}
}

public class override_vehicle {

	public static void main(String[] args) {
		Car car=new Car();
		car.drive();

	}

}
