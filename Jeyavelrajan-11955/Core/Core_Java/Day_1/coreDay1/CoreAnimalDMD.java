package com.jeyavel.coreDay1;

abstract class d_Animal{
	abstract void sound();
}

class lion extends d_Animal{
	void sound() {
		System.out.println("Lion rore");
	}
}
class tiger extends d_Animal{
	void sound() {
		System.out.println("Tiger gowl");
	}
}

public class CoreAnimalDMD {

	public static void main(String[] args) {
		d_Animal lion = new lion();
		lion.sound();
		
		d_Animal tiger = new tiger();
		tiger.sound();
		
		lion L_lion = new lion();
		L_lion.sound();
		
		tiger T_tiger = new tiger();
		T_tiger.sound();

	}

}
