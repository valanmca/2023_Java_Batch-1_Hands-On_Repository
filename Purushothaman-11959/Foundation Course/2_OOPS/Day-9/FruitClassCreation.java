package com.purushoth.day9;

class Fruits{
	//variables
	String color;
	float price;
	
	//constructor
	Fruits(String color,float price){//To initialize the variable
		this.color=color;
		this.price=price;
	}
	
	//Method
	void show() {
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	} 
}
public class FruitClassCreation {

	public static void main(String[] args) {
		// Object creation and constructor calling
		Fruits apple=new Fruits("Red",200.0f);
		
		//method calling
		apple.show();
		
		Fruits orange=new Fruits("Orange",150);
		orange.show();

	}

}
