package com.oops;
abstract class animal1
{
	abstract void sound(); // default public and abstract
	
}
class lion extends animal1
{
	void sound()
	{
		System.out.println("lion Roars");
	}
}

class Tiger extends animal1
{
	void sound()
	{
		System.out.println("Tiger Growl");
	}
}

public class abstractAnimal {

	public static void main(String[] args) {
		lion obj=new lion ();
		obj.sound();
		
		Tiger obj1=new Tiger ();
		obj1.sound();
	}

}
