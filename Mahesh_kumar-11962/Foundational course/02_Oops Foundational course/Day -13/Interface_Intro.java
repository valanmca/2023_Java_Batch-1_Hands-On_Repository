package com.mahesh.Oops_day13;
interface Vehicle_Plan
{
	//Interface having fully abstract methods only.
	//By default ducluring all the methods are abstract.\
	// abstact keyword is optional in Interface class.
	void engine();
	void brand();
	void wheels();
	void gear();
}

abstract class Vehicles implements Vehicle_Plan
{
	public void engine()
	{
		System.out.println("Bike have one engine");
	}
	abstract public void brand();
	abstract public void wheels();
	abstract public void gear() ;
	
}
class Bikes_02 extends Vehicles
{
	
	
	public void brand()
	{
		System.out.println("Honda Bike");
	}
	
	public void wheels()
	{
		System.out.println("Bike have 2 wheels");
	}
	public void gear()
	{
		System.out.println("Bike have 5 gear");
	}
}
public class Interface_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle_Plan vandi = new Bikes_02();
		vandi.brand();
		vandi.engine();
		vandi.wheels();
		vandi.gear();
	}

}
