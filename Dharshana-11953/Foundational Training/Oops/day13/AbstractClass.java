package com.dharshu.day13;
abstract class Vehi{
	Vehi(int a){
		System.out.println("Constructor");
	}
	public void engine() {
		System.out.println("\nAll the vehicle have one engine");
	}
	public abstract void wheel();
	
	public abstract void BrandName();
}

class Bik extends Vehi{
	 Bik(){
		super(5); 
	 }
	public void wheel() {
		System.out.println("Bike has 2 wheel");
	}
	
	public void BrandName() {
		System.out.println("Brand name is: Honda");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Vehi obj=new Bik();
		obj.engine();
		obj.wheel();
		obj.BrandName();

	}

}
