package com.swetha.day10;
class Vehicle{                   //Multi level inheritance example
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels () {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name Honda");
	}
}

public class MultiLevelInherit {

	public static void main(String[] args) {
		Bike obj=new Bike();    //Creating object for 'bike' class,it has the access TwoWheeler class and vehicle class.
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
				

	}

}
