package com.jeyavel.OOPS.day13;

abstract class vehicle2 {
	
	//constructor- we can define a Constructor in Abstract Class
	vehicle2(int a,int b){//constructor inovaction so the super class constructor will be executed first 
		System.out.println("WE Can Define A Constructor in Abstract Class");
	}
	
	public void engine() {
		System.out.println("All the Vehicle Have one Engine");
	}

	abstract void wheel();

	abstract void brandName();

	abstract void Vehicle();
}

//At a time we Cannot Extends More than one Class (Because multiple inheritance is not Supported in java) 
 class Bike2 extends vehicle2 {
	 Bike2(){
		 super(4,6);//use super keyword if  we declare a (super constructor with a argenments)
	 }
	void wheel() {
		System.out.println("it has two wheels");
	}

	void brandName() {
		System.out.println("Brand Name Honda ");
	}

	void Vehicle() {
		System.out.println("Vehicle is MotorCycle");
	}


}

public class AbstractExNo4 {

	public static void main(String[] args) {
		vehicle2 veh =new Bike2();
		veh.brandName();
		veh.wheel();
		veh.Vehicle();

	}

}
