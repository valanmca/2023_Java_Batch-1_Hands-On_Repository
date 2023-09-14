package com.jeban.OOPsday3;//Constructor Invokation Order

class vehicle1{
	vehicle1(){
		System.out.println("Constructor From Vehicel");
		
	}
}

class TwoWheeler1 extends vehicle1{
	TwoWheeler1(){
	System.out.println("Constructor From TwoWheeler");
	}
	
}

class Bike1 extends TwoWheeler1{
	Bike1(){
		System.out.println("Constructor From Bike");
	}
	
}
public class inheritance4 {

	public static void main(String[] args) {
		Bike1 obj=new Bike1();
		
		
		
		
		

	}

}
