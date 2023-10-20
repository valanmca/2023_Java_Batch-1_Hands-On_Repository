package com.dharshu.day6;

interface One2{
	int a=10; //public static final
}

interface Two2 extends One2{
	int a=20;
}

interface Three1 extends One2,Two2{ //Multiple Inheritance
	void sum();
}

class Calculator2 implements Three1{
	public void sum() {
		System.out.println(One2.a+Two2.a);
	}
}


public class Ambiguous_Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 calc = new Calculator2 ();
		calc.sum();
	}

}
