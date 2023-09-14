package com.gayathri.day8;

class Mobile
{//instance variable
	String brandname;
	float price;
	//parameterized constructor
	Mobile(String brandname, float price)
	{//instance name same as local variable name so we use this pointer to point the current object
		this.brandname = brandname;
		this.price = price;
	}
	//instance method
	void display() 
	{
		System.out.println("Brand Name : "+brandname);
		System.out.println("Price : "+price);
	}
}
public class MobileClassObject {

	public static void main(String[] args) {
		
		Mobile gmobile = new Mobile("Mi10i",25000.0f);
		gmobile.display();
		
		Mobile dmobile = new Mobile("Samsung",30000.0f);
		dmobile.display();

	}
}