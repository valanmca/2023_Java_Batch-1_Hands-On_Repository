package com.madhan.day08;

class Mobile 
  {
     // variables
	String brandname;
	float price;
	
	//constructor
	Mobile(String brandname,float price)
	{
		this.brandname=brandname;
		this.price=price;
	}
	
	//method
	void display()
	{
		System.out.println("BrandName:" +brandname);
		System.out.println("Price:" +price);
	}
  }
public class OopsExample3 {

	public static void main(String[] args) {
		Mobile poco=new Mobile("Poco",10000);
		poco.display();
		Mobile realme=new Mobile("Realme", 20000);
		realme.display();

	}
}
