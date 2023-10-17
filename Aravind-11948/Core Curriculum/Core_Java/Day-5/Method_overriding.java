package com.core.day_05;
class A1{
	void display()
	{
		System.out.println("A");
	}
	
}

class B1 extends A1{
	void display()
	{
		System.out.println("B");
	}
	
}
public class Method_overriding {

	public static void main(String[] args) {
		
		A1 obj=new B1 ();
		obj.display();
		

	}

}
