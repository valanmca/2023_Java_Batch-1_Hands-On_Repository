package com.jeban.OOPsday6;//Interface and Abstract

interface VehiclePlan {// by default interface methods all are abstract.
	void engine();

	void Wheel();

	void brandname();

}

abstract class Vechicle implements VehiclePlan {
	public void engine() {
		System.out.println("all vechicle have one engine");

	}

	public abstract void Wheel();

	public abstract void brandname();// we cannot

}

class Bike extends Vechicle {
	public void Wheel() {
		System.out.println("Bike has two wheel");

	}

	public void brandname() {
		System.out.println("Honda");
	}

}

public class Abstract3 {

	public static void main(String[] args) {
		Vechicle obj = new Bike();
		obj.Wheel();
		obj.brandname();

		VehiclePlan obj1 = new Bike();
		obj1.Wheel();
		obj1.brandname();
		obj1.engine();

	}

}