package com.core.day_05;

class C{
	
	int a=10; // variables cannot be override
	static void display() // static method cannot be override (overriding is based on object)
	{
		System.out.println("C");
	}
	
}

class D extends C{
	int a=20;
	static void display()
	{
		System.out.println("D");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		C obj=new D();
		
		D obj1=new D();
		obj.display();
		int c=obj.a;
		int d=obj1.a;
		
		System.out.println("Dynamic method dispatch obj ="+c);
		System.out.println("Object of D class ="+d);
		
		

	}

}
