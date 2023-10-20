package com.jenish.day6;
interface One1 {
	int a=10; //public static final
}
interface Two2 extends One1 {
	int a=20;
}
interface Three extends One1, Two2 { //Multiple Inheritance
	void sum();
}
class Calculator1 implements Three {
	public void sum() {
		System.out.println(One1.a + Two2.a); // to over come ambiguous
	}
}
public class Ex_4_Static_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 calc = new Calculator1();
		calc.sum();
	}

}
