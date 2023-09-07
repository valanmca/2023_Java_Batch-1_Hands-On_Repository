package com.jenish.day09;
class Fruits{
	//variables
	String color;
	float price;
	
	//constructor
	Fruits(String color, float price){
		this.color=color;
		this.price=price;
	}
	
	//method
	void display() {
		System.out.println("Color:" +color);
		System.out.println("Price:" +price);

	}
}
public class Oops_ClassCreation_Fruits_Ex4 {

	public static void main(String[] args) {
		Fruits apple=new Fruits("Red", 100.0f);
		apple.display();
		Fruits grapes=new Fruits("Purple", 200.0f);
		grapes.display();

	}

}
