package com.swetha.day8;
class Mobile{
	
	String brandName;
	float price;
	
	//Constructor
	Mobile(String brandName,float price){
		this.brandName=brandName;
		this.price=price;
	}
	//Method
	void display(){
		System.out.println("Brandname : "+brandName);
		System.out.println("Price : "+price);
	}
}
public class MobileClassObj {

	public static void main(String[] args) {
		//object creation and constructor calling
		Mobile samsung=new Mobile("Samsung",10000);
		samsung.display();
		
		Mobile redmi=new Mobile("redmi",20000);
		redmi.display();

	}

}
