package com.swetha.day9;
class Fruits{
	String color;
	float price;
	
	//Constructor
	Fruits(String color,float price){
		this.color=color;
		this.price=price;
	}
	//Method
	void display() {
		System.out.println("color : "+color);
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Fruits apple=new Fruits("Red",100.0f);
		apple.display();

	}

}
