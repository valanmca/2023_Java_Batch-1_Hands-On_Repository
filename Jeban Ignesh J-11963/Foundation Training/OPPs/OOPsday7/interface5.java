package com.jeban.OOPsday7;
//Multiple Inheritance using interfaces

interface one {
	int a = 10;// public static final
	int b=2;
	
}

interface two{
	int a=20;//public static final
	int b=50;
}

interface three extends one,two{
	void addition();
	void multiplication();
	void subtraction();
	void division();
}

class Calc implements three{
	public void addition() {
		System.out.println("Addition :"+(one.a+two.a));
	}
	public void multiplication() {
		System.out.println("multiplication :"+(one.b*two.b));
	}
	public void subtraction() {
		System.out.println("Subtraction :"+(one.a-two.b));
	}
	public void division() {
		System.out.println("Division :"+(one.b/two.a));
	}
}
public class interface5 {

	public static void main(String[] args) {
//		three obj=new Calc();
		Calc obj=new Calc();
		obj.addition();
		obj.multiplication();
		obj.subtraction();
		obj.division();
		

	}

}
