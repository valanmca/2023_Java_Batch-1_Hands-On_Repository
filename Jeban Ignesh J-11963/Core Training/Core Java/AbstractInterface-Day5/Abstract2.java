package com.jeban.AbstractInterface;

interface Ones{
	int a=10;//public static final
}
interface Twos extends Ones{
	int a=20;
}
interface Three extends Ones,Twos{//Multiple Inheritance
	void sum();
	
}
class Calculator1 implements Three{
	public void sum() {
		System.out.println(Ones.a+Twos.a);
	}
}
public class Abstract2 {

	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		calc.sum();
	}

}
