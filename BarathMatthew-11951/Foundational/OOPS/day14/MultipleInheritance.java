package com.matthew.day14;
//Multiple Inheritance using Interfaces

interface One{
	int a = 10; //public static final
}

interface Two{
	int a = 20; //public static final
}

interface Three extends One,Two{
	void addition();
}

class Calculator3 implements Three{
	public void addition() {
		//since interface is static we can call the variable with class name without object 
		//since its final there will be two 'a' values to avoid ambiguous error we use calssName.variableName
		System.out.println("Sum of two number : "+(One.a+Two.a));
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		//creating object for calculator3
		
		Calculator3 obj = new Calculator3();
		obj.addition();

	}

}
