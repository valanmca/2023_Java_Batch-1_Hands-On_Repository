//Constructor invocation order

package com.jeyandhan.day10;

class Vehic{ //super class
	Vehic(){
		System.out.println("Constructor From Vehicle");
	}
}

class TwoWheel extends Vehic{ //sub class of vehic
	TwoWheel(){
		System.out.println("Constructor From TwoWheel");
	}
}

class Bike extends TwoWheel{ //sub class of TwoWheel
	Bike(){
		System.out.println("Constructor From Bike");
	}
}

public class ConnstructorInvocation {

	public static void main(String[] args) {
		Bike obj = new Bike();

	}

}
