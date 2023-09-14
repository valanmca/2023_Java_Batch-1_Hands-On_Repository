package com.muthu.day10;
class Vehicle1{
	Vehicle1(){
	System.out.println("Constructor From Vehical1");
		
	}
}
class TwoWheeler1 extends Vehicle1{
	TwoWheeler1() {
		System.out.println("Constructor From TwoWheeler1");
	}
}
class Bike1 extends TwoWheeler1{
	Bike1() {
		System.out.println("Constructor From Bike1");
	}
}


public class ex3 {
	public static void main(String[] args) {
		Bike1 bike=new Bike1();
		

}
}