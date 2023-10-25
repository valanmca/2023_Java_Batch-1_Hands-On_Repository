package com.madhan.coreday1;

abstract class Animals
{
	abstract public void sound();
	void name()
	{
		System.out.println("Madhan");
	}
}
class Lion extends Animals{
	public void sound()
	{
		System.out.println("Lion will roar");
	}
}
class Tiger extends Animals
{
	public void sound()
	{
		System.out.println("Tiger will Growl");
	}
}
public class AbstractExample1 {

	public static void main(String[] args) {
		Tiger obj1=new Tiger();
		obj1.sound();
		Animals obj2=new Lion();
		obj2.sound();
		obj2.name();
	}

}
