//mobile
package com.domnic.day8;
class Mobile{
	String brandname;
	float price;
	String ram;
	String storage;
	
	Mobile(String brandname,float price,String ram,String storage){
		this.brandname=brandname;
		this.price=price;
		this.ram=ram;
		this.storage=storage;		
	}
	
	void display() {
		System.out.println("Brand name is :"+brandname);
		System.out.println("Price :"+price);
		System.out.println("Ram :"+ram);
		System.out.println("Storage :"+storage);
		
	}
}

public class Oops2 {

	public static void main(String[] args) {
		Mobile samsung=new Mobile("Samsung",45000.0f,"8gb","128gb");
		samsung.display();
		System.out.println();
		Mobile redmi=new Mobile("Redmi",25000.0f,"6gb","128gb");
		redmi.display();
		System.out.println();
		Mobile oneplus=new Mobile("Oneplus",50000.0f,"12gb","128gb");
		oneplus.display();

	}

}
