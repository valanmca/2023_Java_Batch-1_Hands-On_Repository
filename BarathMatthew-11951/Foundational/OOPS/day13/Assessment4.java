package com.matthew.day13;
//verifying we can create a constructor in abstract class - yes
//we cannot create an object for abstract class 
//The constructor is invoking when the sub class object is created using the reference of the abstract class
abstract class Vehicle1{
	public void engine() {
		System.out.println("All vehicle have one engine");
	}
	//creating a constructor in the abstract class
	Vehicle1(int a,int b){
		System.out.println("Constructor is working");
		System.out.println("The value of A : "+a);
		System.out.println("The value of B : "+b);
	}
	public abstract void wheel();
	public abstract void brandName();
}

class Bike1 extends Vehicle1{
	// to execute the abstract class constructor we are creating a constructor with the super keyword
	Bike1(int a, int b){
		super(a, b);
	}

	public void wheel(){
			System.out.println("Bike has two wheels");
	}
	
	public void brandName() {
		System.out.println("Royal Enfield");
	}
}

public class Assessment4 {

	public static void main(String[] args) {
		Vehicle1 obj = new Bike1(10,20);
		obj.engine();
		obj.wheel();
		obj.brandName();

	}

}
