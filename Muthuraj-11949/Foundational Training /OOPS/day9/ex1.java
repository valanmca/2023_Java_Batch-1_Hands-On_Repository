package com.muthu.day9;
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
		System.out.println("color:"+color);

		System.out.println("price:"+price);
		
	}
}

public class ex1 {

	public static void main(String[] args) {
		Fruits apple=new Fruits("Green",150f);
		apple.display();
		Fruits orange=new Fruits("ornage",120f);
		orange.display();
		
		

	}

}
