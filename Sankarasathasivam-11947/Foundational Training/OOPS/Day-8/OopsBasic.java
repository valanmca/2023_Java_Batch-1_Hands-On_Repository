package com.shiva.day08;

class Mobile
{
	//variable
	String brandName;
	float price;
	
	//constructor
	Mobile(String brandName, float price)
	{
		this.brandName=brandName;
		this.price=price;
	}
	
	//Method
	void display()
	{
		System.out.println("Brand Name : "+brandName);
		System.out.println("Price : "+price);
	}
}
public class OopsBasic {

	public static void main(String[] args) {
		// Object creation and constructor calling
		Mobile Vivo=new Mobile("Vivo",10000.0f);
		Vivo.display();
		
		Mobile poco=new Mobile("Poco",20000.0f);
		poco.display();

	}

}
