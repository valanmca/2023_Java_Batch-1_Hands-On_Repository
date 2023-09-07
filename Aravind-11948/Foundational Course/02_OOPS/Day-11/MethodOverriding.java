package com.aravind.day11;
// method overriding using objects memory allocation in run time
class Animal
{
	public void  eat()
	{
	System.out.println("All animals eat");	
	}
	
}



class dog extends Animal
{
	public void eat()
	{
		//this.thiskey();call current class object
		//super.eat();//call superclass method
		System.out.println("Dog eat chicken");
	}
	void thiskey()
	{
		System.out.println("this");
	}
	
}

class cat extends Animal
{
	public void eat()
	{
		System.out.println("cat eat fish");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		dog obj=new dog();
		obj.eat();
		cat obj1=new cat();
		obj1.eat();
		

	}

}
