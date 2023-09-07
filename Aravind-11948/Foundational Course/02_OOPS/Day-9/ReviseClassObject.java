package com.aravind.day9;
class Fruits
{
	// variable
	String name;
	String color;
	float price;
	 
	//constructor
	Fruits(String name,String color,float price)
	{
		System.out.println("constructor works");
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	
	//method
	
	void display()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		
	}
}

public class ReviseClassObject {

	public static void main(String[] args) {
		Fruits apple=new Fruits("apple","red",5.0f);
		
		apple.display();
		
		Fruits orange=new Fruits("orange","light yellow",10.0f);
		
		orange.display();
		
		

	}

}
