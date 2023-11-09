
//Overriding - runtime polymorphism 
//Overriding is completely based on object
//we cannot override static method 
//variable cannot be override
package com.jeyavel.coreDay5;

class c1{
	int a = 10;
	void display() {
		System.out.println("A");
	}
}
class B1 extends c1{
	int a = 20;
	void display() {
		super.display();
		System.out.println("B");
	}
}
public class InheritanceExno3 {

	public static void main(String[] args) {
		c1 obj = new B1();
		obj.display();
		System.out.println(obj.a);

	}

}
