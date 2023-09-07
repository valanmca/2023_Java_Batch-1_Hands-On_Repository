package com.purushoth.day8;

class Mobile{
	//variables
	String brandname;
	float price;
	
	//constructor
	Mobile(String brandname,float price){
	this.brandname=brandname;
	this.price=price;
	}
	
	//Method
	void display() {
		System.out.println("Brand Name: "+brandname);
		System.out.println("Price: "+price);
	}
}

public class FruitsClassCreation {

	public static void main(String[] args) {
		// Object creation and constructor calling
		Mobile vivo=new Mobile("Vivo", 20000.0f);
		vivo.display();
		
		Mobile realme=new Mobile("Realme", 15000.0f);
		realme.display();

	}

}
