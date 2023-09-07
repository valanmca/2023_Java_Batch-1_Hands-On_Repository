package com.domnic.day9;

class Fruits{
	//variables
	String color;
	float price;
	
	//constructor
	Fruits(String color,float price){
		this.color=color;
		this.price=price;
	}
	
	//method
	void display() {
		System.out.println("Color :"+color);
		System.out.println("Price :"+price);
	}
}
public class Oops3 {

	public static void main(String[] args) {
	
        Fruits apple=new Fruits("Green",100.00f);
        apple.display();
        Fruits orange=new Fruits("Orange",120.00f);
        orange.display();
	}

}
