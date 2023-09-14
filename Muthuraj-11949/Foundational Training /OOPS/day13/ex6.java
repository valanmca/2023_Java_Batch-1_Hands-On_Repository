package com.muthu.day13;
abstract class   Vehicle2 {
	Vehicle2(int a) {
		System.out.println("Constructor from Abstract class");}
	public void engine() {
		System.out.println("All vehicle have one engine");
	}

	public abstract void wheel();

	public abstract void brandName();
}

class Bike2 extends Vehicle2 {
	Bike2(){
		super(5);
	}
	
	public void wheel() {
		System.out.println("Bike1 has two wheel");
	}

	public void brandName() {
		System.out.println("PULSAR");
	}

}

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 obj = new Bike2();
		obj.engine();
		obj.wheel();
		obj.brandName();

	}

}
