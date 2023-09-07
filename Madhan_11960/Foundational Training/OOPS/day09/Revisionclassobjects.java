package com.madhan.day09;

class Fruits
{
	//Variables
	String name;
	float price;
	
	//constructor
	Fruits(String name,float price)
	{
		this.name=name;
		this.price=price;
	}
	
	//Method
	void display()
	{
		System.out.println("Name of the fruit:" +name);
		System.out.println("Price:" +price);
	}
}

public class Revisionclassobjects {

	public static void main(String[] args) {
		Fruits apple=new Fruits("Apple",300.0f);
		apple.display();
		Fruits mango=new Fruits("Orange",200.0f);
		mango.display();

	}

}
