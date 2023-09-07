

package com.jeyavel.OOPS.day9;


class Fruits{
	//Variables 
	String color;
	float price;


//constructor- used to initialize  the variable
Fruits(String color,float price ){
	this.color=color;
	this.price=price;
	
}

void display() {
	System.out.println("Display the Color And Price");
	System.out.println("Color = "+color);
	System.out.println("Price = "+price);
	}
}

public class OopsExNo4 {
	
	public static void main(String[] args) {
		//Creating Object
	Fruits Apple = new Fruits("Red",85.0f);
	Apple.display();
	Fruits Orange = new Fruits("orange",35.0f);
    Orange.display();
	}

}
