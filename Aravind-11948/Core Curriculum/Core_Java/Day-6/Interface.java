package com.core.day_06;

 interface VehiclePlan{ //default abstract,default we are able to declare it us public  
	void noOfEngine();
	void noOfWheel() ;
	 void brandName();
	
}

abstract class Vehicle1 implements VehiclePlan{ 
	
	
	 public void noOfEngine() {
		System.out.println("I have one engine ");
	}
	
	abstract public void noOfWheel() ;
	abstract public void brandName();
}

class Bike1 extends Vehicle1
{    
	
	
	
	public void noOfWheel() {
		 System.out.println("I have two wheels");
		 
	 }
	public void brandName()
	 {
		System.out.println("MT-15") ;
	 }
}


public class Interface {

	public static void main(String[] args) {
		VehiclePlan obj=new Bike1();
		 obj.noOfEngine();
		 obj.noOfWheel();
		 obj.brandName();
		
		 
		

	}

}
