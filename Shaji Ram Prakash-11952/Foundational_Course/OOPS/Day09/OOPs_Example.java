package com.shaji.Day09;

class fruits{
	//Variables
	String color;
	float price;
	
	//constructor
	fruits(String color, float price){
		this.color = color;
		this.price = price;
}
	//method
	void display() {
		System.out.println(" ");
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
	}
}

public class OOPs_Example {

	public static void main(String[] args) {
		fruits apple = new fruits("Red", 100.0f);
		apple.display();
		
		fruits mango = new fruits("Yellow", 50.0f);
		mango.display();

	}

}
