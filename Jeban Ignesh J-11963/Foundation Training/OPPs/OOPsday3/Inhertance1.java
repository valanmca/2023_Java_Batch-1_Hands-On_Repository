package com.jeban.OOPsday3;

//super class
class Vehicle{
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	
}

//sub class1
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
	
}
//sub class2	
class Bike extends TwoWheeler{//we can use extends to inherit with super class
	void brandname() {
		System.out.println("Brand name HONDA");
	}
	
}


public class Inhertance1 {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandname();
		

	}

}
