


package com.jeyavel.OOPS.day13;


//in real time project use Abstract Class 
abstract class vehicle{
	//concrete variable
	void engine() {
		System.out.println("All the Vehicle Have one Engine");
	}
	//abstract variable  
	abstract void wheel();
	
	abstract void brandName();
	
	abstract void Vehicle();
}

class Bike extends vehicle{
	void wheel() {
		System.out.println("it has two wheels");
	}
	void brandName() {
		System.out.println("Brand Name Honda ");
	}
	void Vehicle() {
		System.out.println("Vehicle is MotorCycle");
	}
	
}



public class AbstractExNo3 {

	public static void main(String[] args) {
		vehicle veh = new Bike();
		veh.engine();
		veh.wheel();
		veh.brandName();
		veh.Vehicle();
		

	}

}
