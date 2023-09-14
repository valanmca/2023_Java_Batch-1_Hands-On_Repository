package com.matthew.day08;

class Mobile{
	//variable
	String brandName;
	float price;
	
	//constructor - initialize the value
	Mobile(String brandName,float price){
		this.brandName = brandName;
		this.price = price;
	}
	
	//Method
	void display() {
		System.out.println("Brand Name : "+ brandName);
		System.out.println("Price : "+ price);
	}
}
public class ExampleMobile {

	public static void main(String[] args) {
		//creating an object
		
		Mobile Redmi = new Mobile("RedMi",25000.00f);
		Redmi.display();
		
		Mobile Samsung = new Mobile("Samsung",20000.02f);
		Samsung.display();
		Samsung.price = 19000.05f;
		Samsung.display();

	}

}
