package com.dharshu.day9;

class Fruits{
	 //variable
	String color;
	float price;
	
	//constructor
	Fruits(String color,float price){
		this.color=color;
		this.price=price;
	}
	
	//method
	void display() {
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
	}
	
}

public class FruitsClassObject {

	public static void main(String[] args) {
		Fruits apple=new Fruits("red",250);
		apple.display();
		
		Fruits orange=new Fruits("orange",150);
		orange.display();
	}

}
