package com.jeban.OOPsday6;

abstract class Veichel2 {
	void engine() {
		System.out.println("veichel have one engine");

	}

	public abstract void wheel();

	public abstract void fuel();

}

class Lorry extends Veichel2 {
	public void wheel() {
		System.out.println("Lorry have four weels");
	}

	public void fuel() {
		System.out.println("Diesel");

	}

}

public class Abstraction5 {

	public static void main(String[] args) {
		Veichel2 obj = new Lorry();
		obj.wheel();
		obj.fuel();
		obj.engine();

	}

}
