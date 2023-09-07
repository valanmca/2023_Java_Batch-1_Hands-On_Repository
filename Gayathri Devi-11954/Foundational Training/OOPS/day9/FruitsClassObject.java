package com.gayathri.day9;

class Fruits{
	//variables
	String color;
	float price;
	
	//constructor
	Fruits(String color,float price){
		this.color = color;
		this.price = price;		
	}
	
	//method 
	void display() {
		System.out.print("Color : "+color+"  ");
		System.out.print("Price : "+price+"\n");
	}
}
public class FruitsClassObject {

	public static void main(String[] args) {
		Fruits apple = new Fruits("Green",100f);//constructor call automatically
		apple.display();//method we call it manually
		Fruits orange = new Fruits("Orange",150f);
		orange.display();
		Fruits grapes = new Fruits("Purple",200f);
		grapes.display();
	}

}
