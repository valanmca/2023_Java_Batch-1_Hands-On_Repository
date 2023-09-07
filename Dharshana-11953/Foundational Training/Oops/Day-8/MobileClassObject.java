package com.dharshu.day8;

class Mobile{
	String BrandName;
	float price;
	
	//constructor
	Mobile(String BrandName,float price){
		
		//this keyword refers the current object.
		//we can avoid name conflict between local and instance variable by using "this" keyword
				
		this.BrandName=BrandName;
		this.price=price;
	}
	
	//method
	void display() {
		System.out.println("Mobile Brand Name:"+BrandName);
		System.out.println("Mobile Price:"+price);
	}
}

public class MobileClassObject {

	public static void main(String[] args) {
		//object creation and calling the constructor
		Mobile m=new Mobile("Tecno",7000.0f);
		m.display();
		
		Mobile m1=new Mobile("Nokia",12000.0f);
		m1.display();

	}

}
