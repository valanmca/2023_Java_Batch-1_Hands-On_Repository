package com.swetha.day14;

//Multiple inheritance using interface
interface One{
	int a=10;     //public,static,final
}
interface Two{
	int a=20;     //public,static,final
}
interface Three extends One,Two{      //Multiple
	void addition();   //public,abstract
}
class Calculator2 implements Three{
	public void addition() {
		System.out.println("Addition : "+(One.a+Two.a));
	}
}
public class MultipleInheritUsingInterface4 {

	public static void main(String[] args) {
		Calculator2 obj=new Calculator2();
		obj.addition();

	}

}
