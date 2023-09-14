package com.muthu.day13;
interface VehiclePlan {
	void engine();

	void wheel();

	void brandName();
}

abstract class Vehicles implements VehiclePlan {
	public void engine() {
		System.out.println("All vehicle have one engine");
	}

	public abstract void wheel();

	public abstract void brandName();
}

class Bike1 extends Vehicles {
	public void wheel() {
		System.out.println("Bike1 has two wheel");
	}

	public void brandName() {
		System.out.println("PULSAR");
	}

}

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles obj = new Bike1();
		obj.wheel();
		obj.brandName();
		VehiclePlan obj1 = new Bike1();
		obj1.wheel();
		obj1.brandName();

	}

}
