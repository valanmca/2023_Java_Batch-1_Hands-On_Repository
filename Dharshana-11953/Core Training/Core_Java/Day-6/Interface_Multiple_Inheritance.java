package com.dharshu.day6;

interface One1{
	int a=10; //public static final
}

interface Two1 extends One1{
	int b=20;
}

interface Three extends One1,Two1{ //Multiple Inheritance
	void sum();
}

class Calculator1 implements Three{
	public void sum() {
		System.out.println(a+b);
	}
}

public class Interface_Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 calc = new Calculator1 ();
		calc.sum();
	}

}
