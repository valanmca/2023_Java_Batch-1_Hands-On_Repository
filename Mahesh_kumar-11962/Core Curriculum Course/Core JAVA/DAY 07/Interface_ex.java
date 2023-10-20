package com.mahesh.core_java_day_07;
abstract interface Vehicleplan
{
	void Engine();
	void wheel();
	void brand();
}
abstract class Vehicle implements Vehicleplan
{
	public void Engine()
	{
	System.out.println("I Have a One Engine");	
	}
	
	public abstract void wheel();
	public abstract void brand();
	
}

class Bike extends Vehicle
{
	public void wheel()
	{
		System.out.println("I have 2 wheels");
		
	}
	public void brand() {
		System.out.println("Hero Honda	");
	}
}
public class Interface_ex {
	

	public static void main(String[] args) {
	 
		Vehicleplan run  = new Bike();
		run.Engine();
		run.wheel();
		run.brand();

	}

}
