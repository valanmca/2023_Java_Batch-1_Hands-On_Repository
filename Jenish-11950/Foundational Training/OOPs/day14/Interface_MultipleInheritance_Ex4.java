package com.jenish.day14;
//Multiple Inheritance Using Interfaces

interface One {
	int a=10; //public static final
	
}
interface Two {
	int a=30; //public static final
}

interface Three extends One, Two { //Multiple Inheritance
	void addition(); //public abstract
}
class Calculator02 implements Three {
	public void addition() {
		System.out.println("Addition : " + (One.a + One.a));
	}
}

public class Interface_MultipleInheritance_Ex4 {

	public static void main(String[] args) {
		Calculator02 obj1 = new Calculator02();
		obj1.addition();

	}

}
