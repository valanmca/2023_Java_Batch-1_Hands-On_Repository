package com.jenish.day08;
class Mobile{
	//variables
	String brandName;
	float price;
	
	//Constructor
	Mobile(String brandName, float price){
		this.brandName=brandName;
		this.price=price;
	}
	//Method
	void display() {
		System.out.println("Brand Name:" +brandName);
		System.out.println("Price:" +price);
	}
}
public class Oops_ClassCreation_Mobile_Ex3 {

	public static void main(String[] args) {
		//Object Creation and Constructor Calling
		Mobile samsung = new Mobile("Samsung", 10000.0f);
		samsung.display();
		
		Mobile nokia = new Mobile("Nokia", 60000.0f);
		nokia.display();

	}

}
