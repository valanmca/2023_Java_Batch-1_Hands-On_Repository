package com.mahesh.Oops_day9;



class shoe
{
	String brand;
	int size;
	String color;
	String type;
	
	
	shoe(String brand,int size,String color,String type)
	{
		this.brand=brand;
		this.size =size;
		this.color=color;
		this.type =type;
		
	}
	void display()
	{
		System.out.println("Shoe Brand :"+brand);
		System.out.println("Shoe Size :"+size);
		System.out.println("Shoe Color :"+color);
		System.out.println("Shoe Type/Model :"+type);
		System.out.print("\n");
	}
}
public class Class_Object_Revise {
	
	public static void main(String[] args) {
		
		shoe bata = new shoe("Bata",9,"Black","Office Shoe");
		bata.display();
		shoe vkc = new shoe("vkc",8,"White","Non Markable");
		vkc.display();
		shoe addidas = new shoe("addidas",8,"red","sports");
		addidas.display();

	}

}
