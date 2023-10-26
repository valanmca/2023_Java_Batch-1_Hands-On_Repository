//Method Overriding
//Write a java program to create a class called Vehicle with a method called drive(). 
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package oopsDay1_Day2;

class Vehicle{
	public void drive() {
		System.out.println("Driving a vehicle");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a car");
	}
}

public class OverrideVehicle {

	public static void main(String[] args) {

		Car obj=new Car();
		obj.drive();
	}

}
