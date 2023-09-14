package com.matthew.day09;

class Fruits{
	// variables
	String color;
	float price;

	// constructor

	Fruits(String color, Float price) {
		this.color = color;
		this.price = price;
		System.out.println(color);
		}

	// method

	void display() {
		System.out.println("color : " + color);
		System.out.println("price : " + price);
		
	}
}

public class MainClass {
	public static void main(String[] args) {
		// creating object

		Fruits mango = new Fruits("Red", 100.75f);
//		mango.display();
	}
}
