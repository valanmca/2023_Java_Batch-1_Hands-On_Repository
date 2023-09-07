package com.jeyavel.OOPS.day13;

//interface is a collection of Abstract Method
//interface is not a class
interface vehiclePlan{
	void engine();//Abstract keyword is Optional(By default interface method is Abstract)
	void wheel();
	void brandName();
//	void vehicle();
}

//Interface Methods All are (Public Abstract)
abstract class vehicle1 implements vehiclePlan{
	public void engine() {
		System.out.println("All the Vehicle Have one Engine");
	}
	//change the Method Abstract to Public 
	public abstract void wheel();
	
	public abstract void brandName();
	
	abstract void Vehicle();
}
class Bike1 extends vehicle1{//we cannot use vehicle method because (Bike1 class use extends in case of implements  so it cannot onherrited)
	public void wheel() {
		System.out.println("it has two wheels");
	}
	public void brandName() {
		System.out.println("Brand Name Honda ");
	}
	void Vehicle() {
		System.out.println("Vehicle is MotorCycle");
	}
	
}




public class InterfaceExNo1 {

	public static void main(String[] args) {
		vehiclePlan obj1 =new Bike1();
		obj1.wheel();
		obj1.engine();
		obj1.brandName();
		
		

	}

}
