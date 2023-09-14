package com.muthu.day8;

class Mobile{
	String brandname;
	float price;
	
	
	//constructor
	Mobile(String brandname,float price){
		this.brandname=brandname;
		this.price=price;
		
	}
	//method
	void display() {
		System.out.println("Brandname:"+brandname);
		System.out.println("Prize:"+price);
	}
}

public class dayex2 {

	public static void main(String[] args) {
		// creation object
		Mobile samsung=new Mobile("Samsung",10000.0f);
		//method calling
		samsung.display();
		
		Mobile nokia=new Mobile("Nokia",8000.0f);
		//method calling
		nokia.display();
		

	}

}
