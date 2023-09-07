package com.gayathri.day14;
//Multiple Inheritance using Interface

interface One
{
	int a = 10;// here interface variables are comes with dafault "public static final".
	//therefore, its same for public static final int a=10; 
	
	int c = 20;
}
interface Two{
	int b=10;
	int c= 20;
}
//instead of we may create b=10 as a=10, it may get ambiguous problem. so we may directly call the variables using interface name 
//bacause interface variables are static metods. so object create panna thevai illa. direct ah call pannalam

interface Three extends One,Two{
	void add();
}
class MultipleInheriUsingInterface implements Three{
	public void add()
	{
		System.out.println("Add : "+(a+b));
		System.out.println("Add : "+(One.c+Two.c));
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		MultipleInheriUsingInterface obj = new MultipleInheriUsingInterface();
		obj.add();

	}

}
