//Vehicle properties using Multilevel Inheritance

package com.jeyandhan.day10;

class Engine{ //super class
	void noOfEngine(){
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends Engine{ //sub class of Engine class
	void noOfTwoWheeler(){
		System.out.println("I have Two Wheeler");
	}
}
class Brand extends TwoWheeler{ //sub class of TwoWheeler class
	void brandName(){
		System.out.println("Pulsar NS 160");
	}
}


public class Vehicle {

	public static void main(String[] args) {
		System.out.println("Properties of an Vehicle");
		
		//object creation for sub class
			
		Brand obj = new Brand();
		
		//method calling
		obj.noOfEngine();
		obj.noOfTwoWheeler();
		obj.brandName();
	}

}
