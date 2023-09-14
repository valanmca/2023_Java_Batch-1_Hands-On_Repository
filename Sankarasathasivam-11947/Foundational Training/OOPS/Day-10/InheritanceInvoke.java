package com.shiva.day10;

//Constructor Invoking Order

class Vehicles1
{
	Vehicles1()
	{
		System.out.println("Constructor From Vehicle");
	}
}

class TwoWheeler01 extends Vehicles1{
	TwoWheeler01()
	{
		System.out.println("Constructor From TwoWheeler");
	}
}

class Bike1 extends TwoWheeler01{
	Bike1()
	{
		System.out.println("Constructor From Bike");
	}
}
public class InheritanceInvoke {

	public static void main(String[] args) {
		
		Bike1 bike1=new Bike1();

	}

}
