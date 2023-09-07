package com.aravind.day8;
class Mobile
{
	//variable
	String brandName;
	float price;
	
	//constructor
	Mobile(String brandName,float price)//constructor name and class name same 
	{
		System.out.println("contrutor works initialing value to the variable user passes the value of"+'\n'+" variable at the time of ibject creation");
		this.brandName=brandName;
		this.price=price;
	}
	
	void display()
	{
		System.out.println("BrandName :"+brandName);
		System.out.println("price :"+price);
	}
}

public class OopsExample4 {

	public static void main(String[] args) {
		// object creation automatically  constructor calling 
		Mobile samsung=new Mobile("samsung",1000.0f);
		
		samsung.display();
		
		// object creation automatically  constructor calling 
		Mobile nokia=new Mobile("nokia",2000.0f);
		
		samsung.display();
		
		
	}

}
