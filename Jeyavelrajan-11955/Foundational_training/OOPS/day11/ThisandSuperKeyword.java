package com.jeyavel.OOPS.day11;

class SuperClass {
	int a;
	
	SuperClass(){
		System.out.println("Superclass");
		//this.a=a;
		
	}
	void display() {
		System.out.println("Value of A :"+a);
	}
}
class SubClass extends SuperClass{
	SubClass(){
		//super (10);
		//super.display();
		//System.out.println("Value of a "+super.a);
		System.out.println("Value of a "+this.a);
	}
}
public class ThisandSuperKeyword {

	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		SubClass sub =new SubClass();
//		sub.display();

	}

}
