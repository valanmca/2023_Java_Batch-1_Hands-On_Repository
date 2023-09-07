package com.dharshu.day10;

class Super{   //Parent class or Super class
	Super(){
		System.out.println("Constructor from vehicle");
	}
}

class Cycle extends Super{    //Child class or subclass
	Cycle() {
		System.out.println("Constructor from TwoWheeler");
	}
}

class Sub extends Cycle{   //grand child class 
	Sub() {
		System.out.println("Constructor from Bike");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		Sub bike =new Sub();
	}

}
