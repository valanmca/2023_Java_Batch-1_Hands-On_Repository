package Core_Topic_Domnic_Day_1;

class Vehicle{
	void drive() {
		System.out.println("Every Vehicle are drivable");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Reparing a car");
	}
}

class Bike extends Vehicle{
	void drive() {
		System.out.println("Reparing a Bike");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
    Car car=new Car();
    car.drive();
    
    Bike bike=new Bike();
    bike.drive();
    
    
	}

}
