package com.mahesh.Oops_day10;

class Vahicle
{
	Vahicle()
	{
		System.out.println("Constructor from Vahicle");
	}
}
class TwoWheelerbike extends Vahicle
{
	TwoWheelerbike()
	{
		System.out.println("Constructor from TwoWheeler");
	}
}
class Honda extends TwoWheelerbike
{
	Honda()
	{
		System.out.println("Constructor for Honda");
	}
}

public class Constructor_Invocation {

	public static void main(String[] args) {
		 Honda bk= new Honda();

	}

}
