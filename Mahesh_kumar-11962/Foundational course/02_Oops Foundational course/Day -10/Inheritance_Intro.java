package com.mahesh.Oops_day10;

class vehicle {
	void Engine() {
		System.out.println("I have one engine");
	}
}

class TwoWheeler extends vehicle {
	void Wheels() {
		System.out.println("I have only Two wheels");
	}
}

class bike extends TwoWheeler {
	void brand(){
		System.out.println("Brand name is Tvs");
	}
}

public class Inheritance_Intro {

	public static void main(String[] args) {

		bike tvs = new bike();
		tvs.Engine();
		tvs.Wheels();
		tvs.brand();
	}

}
