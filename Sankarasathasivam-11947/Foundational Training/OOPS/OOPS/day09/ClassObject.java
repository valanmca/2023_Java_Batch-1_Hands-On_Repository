package com.shiva.day09;

class Fruits{
	//Variables
	String fruit;
	String color;
	float price;
	
	//Constructor - intialize the varaibles
	Fruits(String fruit, String color, float price)
	{
		this.fruit=fruit;
		this.color=color;
		this.price=price;
	}
	
	//Methods
	void display()
	{
		System.out.println("fruit : "+fruit);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
	}
}
public class ClassObject {

	public static void main(String[] args) {
		Fruits apple=new Fruits("Apple","Red",140.0f);
		apple.display();
		
		Fruits pineapple=new Fruits("Pineapple","Yellow",200.0f);
		pineapple.display();

	}

}
