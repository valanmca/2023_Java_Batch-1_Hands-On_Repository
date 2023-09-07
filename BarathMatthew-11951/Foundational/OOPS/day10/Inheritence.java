//MultiLevel Inheritance-derived class has more than one parent class

package com.matthew.day10;

	//Parent class
	class Vehicle {
		int num = 20;

		void noOfEngines() {
			System.out.println("I have one Engine");
		}
		
	}

	//derived class
	class twoWheeler extends Vehicle {
		void noOfWheeles() {
			System.out.println("I have two Wheeles");
		}
		//int value=200;
	}
	
	//derived class
	class Bike extends twoWheeler{
		void brandName() {
			System.out.println("Brand Name : Honda ");
			
		}
	}
public class Inheritence {	
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.brandName();
		bike.noOfEngines();
		bike.noOfWheeles();
//System.out.println(bike.value);
	}

}
