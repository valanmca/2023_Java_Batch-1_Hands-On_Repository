//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called car that overrides the drive() method to print "Reparing a car".
class Vehicle {
	void drive() {
		System.out.println(" I am a Vehicle ");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println(" Repairing a car ");
	}
}

public class Oops_Example4 {

	public static void main(String[] args) {

		Car Car = new Car();
		Car.drive();
	}
}
