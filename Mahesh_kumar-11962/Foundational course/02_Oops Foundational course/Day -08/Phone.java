package com.mahesh.Oops_day8;

class Mobile_Phone{
	// instance variable
	float Price;
	String Brand;
	String type;

	//constructor
	Mobile_Phone(float Price,String Brand,String type)
	{
		this.Price =Price;
		this.Brand = Brand;
		this.type=type;
	}
	
	void display() {
		System.out.println("Mobile Brand : "+Brand);
		System.out.println("Mobile Price : "+Price);
		System.out.print("Mobile Type : "+type);
		System.out.println("\n");
	}

}


public class Phone {

	public static void main(String[] args) {
	
		Mobile_Phone ss_mb = new Mobile_Phone(18000.50f,"Samsung","flip");
		ss_mb.display();
		
		Mobile_Phone xi_mb = new Mobile_Phone(23000.20f,"Xiaomi","tab");
		xi_mb.display();
	}

}
