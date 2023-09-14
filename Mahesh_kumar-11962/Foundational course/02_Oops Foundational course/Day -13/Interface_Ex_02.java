package com.mahesh.Oops_day13;
interface Vehicle_Planning
{
	//Interface having fully abstract methods only.
	//By default ducluring all the methods are abstract.\
	// abstact keyword is optional in Interface class.
	void engine();
	void brand();
	void wheels();
	void gear();
}

abstract class Vehicles_02 implements Vehicle_Planning
{
	Vehicles_02(int a)
	{
		System.out.println("In abstract class we can define constructor \n"+"Integer value is :"+a+"\n");
	}
	
	public void engine()
	{
		System.out.println("Bike have one engine");
	}
	abstract public void brand();
	abstract public void wheels();
	abstract public void gear() ;
	
}
class Bikes_03 extends Vehicles_02
{
	Bikes_03(){
		//By using super() we can access the super class constructor.
		super(10);
	}
	
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

public class Interface_Ex_02 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Vehicle_Planning vandi = new Bikes_03();
			vandi.brand();
			vandi.engine();
			vandi.wheels();
			vandi.gear();
		}
}
