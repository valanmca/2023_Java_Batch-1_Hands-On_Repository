package com.gayathri.day6;
interface One1 {
	int a=10;	//public static final
}
interface Two1 {
	int b=20;
}
interface Three extends One1, Two1{ //Multiple inheritance
	void sum();
}
class Calculate implements Three{
	public void sum() {
		System.out.println("Sum : "+(a+b));
	}

}
public class ExInterface3 {

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println("Multiple Interface Inheritance");
		c.sum();
		
	}

}
