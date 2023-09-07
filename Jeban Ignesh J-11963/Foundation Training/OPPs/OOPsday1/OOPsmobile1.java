package com.jeban.OOPsday1;

class Mobile{
	//Variable
	String brandname;
	float price;
	String ram;
	
	//constructor
	Mobile(String brandname,float price,String ram){
		this.brandname=brandname;
		this.price=price;
		this.ram=ram;
	}
	//Method
	void display() {
	System.out.println("Mobile brand name:" +brandname);
	System.out.println("Mobile Price:"+price);
	System.out.println("Ram:"+ram);
	}
	
}

public class OOPsmobile1 {

	public static void main(String[] args) {
		//create object and constructor calling
		Mobile samsung=new Mobile("Samsung",12000.0f,"3gb");
		samsung.display();
		
		Mobile Nokia=new Mobile("Nokia",10000.0f,"2gb");
		Nokia.display();

	}

}
